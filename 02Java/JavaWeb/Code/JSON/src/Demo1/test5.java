package Demo1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class test5 {
    @Test
    public void test5() throws Exception{
        // 初始化 JSON 字符串
        String json = "{\"gender\":\"男\",\"name\":\"bob\",\"age\":23}";

        // 创建 ObjectMapper 对象
        ObjectMapper objectMapper = new ObjectMapper();
        // 转换为 Java对象 Person对象
        Person person = null;
        try {
            person = objectMapper.readValue(json, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }
}
