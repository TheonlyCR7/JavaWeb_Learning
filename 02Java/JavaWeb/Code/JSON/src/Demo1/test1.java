package Demo1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class test1 {

    // Java对象转换为 JSON字符串
    @Test
    public void test1() throws IOException {
        // 创建Person对象
        Person person = new Person();
        person.setName("张三");
        person.setAge(23);
        person.setGender("男");
        // 创建 Jackson 的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        // 转换
        // 转换方法: writeValue(参数1, obj);
        // 参数1 可以是
        // File  将 obj 对象转换为 JSON 字符串  并保存到指定的文件中
        // Writer 将 obj 对象转换为 JSON 字符串 并将 json 数据填充到字符输出流中

        // writeValueString(obj) 将对象转为 json 字符串
        String json1 = objectMapper.writeValueAsString(person);
        System.out.println(json1);

        // writeValue 将数据写到 指定路径的文件中
        objectMapper.writeValue(
                new File("D:\\Github_NOTES\\JavaWeb_Learning\\02Java\\JavaWeb\\Code\\JSON\\a.txt"), person);

        // writeValue 将数据关联到 writer 中
        objectMapper.writeValue(
                new FileWriter("D:\\Github_NOTES\\JavaWeb_Learning\\02Java\\JavaWeb\\Code\\JSON\\b.txt"), person);


    }


}
