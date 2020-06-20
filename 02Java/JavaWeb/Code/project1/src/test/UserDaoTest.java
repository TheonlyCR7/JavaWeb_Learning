package test;

import SQL_user.UserDao;
import User.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testLogin(){

        User loginuser = new User();
        loginuser.setUsername("superbaby");
        loginuser.setPassword("123111");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}

