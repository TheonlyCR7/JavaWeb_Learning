package Demo1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

public class test2 {

    // Java对象转换为 JSON字符串
    @Test
    public void test2() throws IOException {
        // 创建Person对象
        Person person = new Person();
        person.setName("张三");
        person.setAge(23);
        person.setGender("男");

        person.setBirthday(new Date());

        // 转换
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
        // {"name":"张三","age":23,"gender":"男","birthday":1594631346261}
    }
}
