package Demo;

import org.junit.Test;
import redis.clients.jedis.Jedis;

// Jedis 的测试类
public class JedisTest {

    @Test
    public void test1(){
        // 获取链接
        // 如果空参构造  默认值为 host: "localhost"  port: "6379"
        Jedis jedis = new Jedis("localhost", 6379);
        // 操作
        jedis.set("username", "lmc");
        String username = jedis.get("username");
        System.out.println(username);

        // 可以使用 setex()方法存储 可以指定过期时间 key value
        // 将 code:lmc 键值对存入 redis中 并且5sed 后自动删除
        jedis.setex("code", 20, "lmc");
        // 关闭连接
        jedis.close();
    }
}
