package JDBC;

import java.sql.*;

public class JdbcDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try{
            // 1. 导入驱动jar包
            // 2. 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");  // 可省略
            // 3. 获取数据库的连接对象
            conn =
                    DriverManager.getConnection(
                            "jdbc:mysql:///school?serverTimezone=GMT%2B8",
                            "root",
                            "123456");
            // 4. 定义SQL语句
            String sql = "select * from students";
            // 5. 获取执行sql 的对象 Statement
            stmt = conn.createStatement();
            // 6. 执行 sql
            rs = stmt.executeQuery(sql);
            // 7. 处理结果
            while(rs.next()) {  // 让光标向下移动一行
                // 获取数据
                int id = rs.getInt(1);   // 获取所在行第一列的int型数据
                String name = rs.getString("name");  // 获取所在行列名为 nickname
                String nickname = rs.getString("nickname");  // 获取所在行列名为 nickname
                String sex = rs.getString(4);   // 获取所在行第4列的String型数据
                // 输出
                System.out.println(id + "---" + "---" + name + "---" + nickname + "---" + sex);
            }
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();  // 捕获两个异常
        } finally {
            // 释放资源
            // 避免空指针异常
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
    }
}
