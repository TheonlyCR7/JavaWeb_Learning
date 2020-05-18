import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo3 {

    // 执行语句
    public static void main(String[] args) {
        //1.键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        //2.调用方法
        boolean flag = new JDBCDemo3().login(username, password);
        //3.判断结果，输出不同语句
        if(flag){
            //登录成功
            System.out.println("登录成功！");
        }else{
            System.out.println("用户名或密码错误！");
        }
    }

    //
    public boolean login(String username, String password){
        if(username == null || password == null)
            return false;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            // 1. 获取连接
            conn = JCBCUtils.getConnection();
            // 2. 定义SQL
            String sql = "select * from students where name = '"+username+"' and nickname = '"+password+"' ";
            // System.out.println(sql);
            // 3. 获取执行SQL对象
            stmt = conn.createStatement();
            // 4. 执行查询
            rs = stmt.executeQuery(sql);
            // 5. 判断
//            if(rs.next()){
//                return true;
//            }else{
//                return false;
//            }
            return rs.next();  // 如果有下一行返回 true

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JCBCUtils.close(rs, stmt, conn);
        }
        return false;
    }
}
