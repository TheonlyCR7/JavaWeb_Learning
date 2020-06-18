package Session_project;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username = null;
    private String password = null;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static List<User> getList() {
        return list;
    }

    public static void setList(List<User> list) {
        User.list = list;
    }

    //•使用简单的集合模拟一个数据库

    private static List<User> list = new ArrayList<>();

    //装载些数据进数据库
    static {

        list.add(new User("aaa","111"));
        list.add(new User("bbb","222"));
        list.add(new User("ccc","333"));
    }

    //通过用户名和密码查找用户
    public static User find(String username, String password) {

        for (User user : list) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }


}
