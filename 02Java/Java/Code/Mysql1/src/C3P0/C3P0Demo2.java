package C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        // 1.
        DataSource dataSource = new ComboPooledDataSource();
        // 2.
        for(int i = 1; i <= 10; i ++){
            Connection connection = dataSource.getConnection();
            System.out.println(i + ":" + connection);
        }
    }
}
