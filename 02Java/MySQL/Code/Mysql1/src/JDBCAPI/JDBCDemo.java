package JDBCAPI;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<Emp> list = new JDBCDemo().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }
    // 查询所有 emp 对象
    public List<Emp> findAll() throws ClassNotFoundException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = new ArrayList<Emp>();
        try{
            // 1. 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/emp?serverTimezone=GMT%2B8",
                    "root",
                    "123456");
            // 3. 定义SQL
            String sql = "select * from emp";
            // 4. 获取执行SQL 的对象
            stmt = conn.createStatement();
            // 5. 执行SQL
            rs = stmt.executeQuery(sql);

            Emp emp = null;
            // 遍历结果集，封装对象，装载集合
            while(rs.next()){
                // 获取数据
                int id = rs.getInt(1);   // 获取所在行第一列的int型数据
                String name = rs.getString("name");  // 获取所在行列名为 nickname
                String nickname = rs.getString("nickname");  // 获取所在行列名为 nickname
                String sex = rs.getString(4);   // 获取所在行第4列的String型数据
                Date joindate = rs.getDate("in_time");

                // 创建 Emp 对象
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setNickName(nickname);
                emp.setSex(sex);
                emp.setJoindate(joindate);

                // 装载集合
                list.add(emp);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(stmt != null){
                try{
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
