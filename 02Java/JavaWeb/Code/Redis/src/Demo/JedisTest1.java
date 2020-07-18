package Demo;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest1 {
    @Test
    public void test1(){
        // 创建一个配置对象
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(50);
        jedisPoolConfig.setMaxIdle(10);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "localhost", 6379);
        // 获取连接
        Jedis jedis = jedisPool.getResource();
        // 使用
        jedis.set("hehe", "haha");
        // 关闭 归还到连接池中
        jedis.close();
    }
}
