package Demo1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test3 {

    // Java对象转换为 JSON字符串
    @Test
    public void test2() throws IOException {
        // 创建Person对象
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(23);
        person1.setGender("男");
        person1.setBirthday(new Date());

        Person person2 = new Person();
        person2.setName("张三");
        person2.setAge(23);
        person2.setGender("男");
        person2.setBirthday(new Date());

        Person person3 = new Person();
        person3.setName("张三");
        person3.setAge(23);
        person3.setGender("男");
        person3.setBirthday(new Date());

        // 创建 List 集合
        List<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(persons);
        System.out.println(json);
    }
}
