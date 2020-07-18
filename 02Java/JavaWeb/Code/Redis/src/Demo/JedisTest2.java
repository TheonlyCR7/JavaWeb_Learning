package Demo;

import Demo.util.JedisPoolUtils;
import redis.clients.jedis.Jedis;

public class JedisTest2 {
    // jedispool 工具类的使用
    // 通过连接池工具类获取
    Jedis jedis = JedisPoolUtils.getJedis();
    // 使用
//    jedis.set("hehe", "haihai");
//
//    // 关闭
//    jedis.close();
}
