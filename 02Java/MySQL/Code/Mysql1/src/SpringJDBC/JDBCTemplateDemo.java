package SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
import toolsClass.JDBCUtils;

public class JDBCTemplateDemo {

    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        // 调用方法
        String sql = "upadate students set money = 500 where id = ?";
        int count = template.update(sql, 1);
        System.out.println(count);
    }


}
