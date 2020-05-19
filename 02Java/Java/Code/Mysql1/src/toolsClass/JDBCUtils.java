package toolsClass;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {

    // 定义成员变量 DataSource
    private static DataSource dataSource;

    static {
        try {
            // 1. 加载配置文件
            Properties properties = new Properties();
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            // 2. 获取DataSource
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取连接池的方法
    public static DataSource getDataSource(){
        return dataSource;
    }

    // 获取连接的方法
    public static Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }

    // 归还连接
    public static void close( Statement statement, Connection connection){
        close(null, statement, connection);
    }
    public static void close(ResultSet resultSet, Statement statement, Connection connection){

        if(resultSet != null){
            try{
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        if(statement != null){
            try{
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        if(connection != null){
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }


}
