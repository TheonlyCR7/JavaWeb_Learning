package SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
import toolsClass.JDBCUtils;

public class JDBCTemplateDemo {

    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    // 调用方法
    String sql = "upadate emp set money = 500 where id = ?";
    template.update();

}
