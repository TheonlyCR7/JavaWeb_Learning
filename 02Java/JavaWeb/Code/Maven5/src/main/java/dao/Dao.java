package dao;

import com.sun.tools.javac.jvm.Items;

import java.sql.SQLException;
import java.util.List;

public interface Dao {
    public List<Items> findAll() throws SQLException, ClassNotFoundException;
}
