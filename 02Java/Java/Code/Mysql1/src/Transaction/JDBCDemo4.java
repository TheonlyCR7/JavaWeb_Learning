package Transaction;

import JDBCAPI.JCBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo4 {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try{
            // 1. 获取连接
            connection = JCBCUtils.getConnection();
            // 开启事务
            connection.setAutoCommit(false);
            // 2. 定义SQL
            String sql1 = "update emp set money = money - ? where id = ?";
            String sql2 = "update emp set money = money + ? where id = ?";
            // 3. 获取执行 SQL 的对象
            pstmt1 = connection.prepareStatement(sql1);
            pstmt2 = connection.prepareStatement(sql2);
            // 4. 设置参数
            pstmt1.setDouble(1, 500);
            pstmt1.setInt(2, 1);

            pstmt2.setDouble(1, 500);
            pstmt2.setInt(2, 2);

            // 5. 执行 SQL
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            // 提交事务
            connection.commit();

        }catch (Exception e){
            if(connection != null){   // 当事务执行发生异常，进行回滚操作
                connection.rollback();
            }
            e.printStackTrace();
        }finally {
            JCBCUtils.close(pstmt1, connection);
            JCBCUtils.close(pstmt2, connection);
        }
    }
}
