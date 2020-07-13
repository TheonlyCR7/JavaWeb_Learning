package Demo1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class test4 {

    // Java对象转换为 JSON字符串
    @Test
    public void test2() throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "bob");
        map.put("age", 23);
        map.put("gender", "男");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(map);
        System.out.println(json);
    }
}
