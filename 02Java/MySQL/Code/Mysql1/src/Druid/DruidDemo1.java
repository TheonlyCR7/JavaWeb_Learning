package Druid;

import toolsClass.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 使用工具类
public class DruidDemo1 {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = JDBCUtils.getConnection();
            String sql = "insert into emp values(?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            // 赋值
            preparedStatement.setInt(1, 5);  // (第1个?位置, 对应的字符串)
            preparedStatement.setString(2, "王五");
            preparedStatement.setString(3, "五哥");
            preparedStatement.setString(4, "男");
            preparedStatement.setString(5, "2020-51-19 18:59:59");
            preparedStatement.setString(6, "3000");
            // 执行sql
            preparedStatement.executeUpdate();
            System.out.println(connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement, connection);
        }
    }
}
