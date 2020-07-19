package impl;


import com.sun.tools.javac.jvm.Items;
import dao.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {

    public List<Items> findAll() throws SQLException, ClassNotFoundException {
        List<Items> list = new ArrayList<Items>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            // 加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            // 获取 connection对象
            connection = DriverManager.getConnection(
                    "jdbc:mysql:///maven", "root", "123456");
            // 获取操作数据的对象
            preparedStatement = connection.prepareCall("select * from items");
            // 执行数据库查询操作
            resultSet = preparedStatement.executeQuery();
            // 把数据库结果转成 java list集合

            while (resultSet.next()){
                Items items = new Items();
                items.setId(resultSet.getInt("id"));
                items.setName(resultSet.getString("name"));
                list.add(items);
            }
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
            preparedStatement.close();
            resultSet.close();
        }
        return list;
    }
}
