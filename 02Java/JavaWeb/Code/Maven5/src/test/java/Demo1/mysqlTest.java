package Demo1;

import com.sun.tools.javac.jvm.Items;
import dao.Dao;
import impl.DaoImpl;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class mysqlTest {
    @Test
    public void findAll() throws SQLException, ClassNotFoundException {
        DaoImpl dao = new DaoImpl();
        List<Items> list = DaoImpl.findAll();
        for (Items items:list){
            System.out.println(items.getName());
        }
    }
}
