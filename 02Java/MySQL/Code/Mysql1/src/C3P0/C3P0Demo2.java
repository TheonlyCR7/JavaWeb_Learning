package C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        // 1.
        DataSource dataSource = new ComboPooledDataSource("otherc3p0");
        // 2.
        for(int i = 1; i <= 11; i ++){
            Connection connection = dataSource.getConnection();
            System.out.println(i + ":" + connection);

            if(i == 5){   // 连接5 会归还连接  所以会多出一个空闲
                connection.close();
            }
        }
    }
}
