import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 导入驱动jar包
        // 2. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 3. 获取数据库的连接对象
        Connection conn =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?serverTimezone=GMT%2B8",
                        "root",
                        "123456");
        // 4. 定义SQL语句
        String sql = "update students set `name` = '苍井空' where id = 4";
        // 5. 获取执行sql 的对象 Statement
        Statement stmt = conn.createStatement();
        // 6. 执行 sql
        //conn.open();
        int count = stmt.executeUpdate(sql);
        // 7. 处理结果
        System.out.println(count);
        // 8. 释放资源
        stmt.close();
        conn.close();
    }
}
