package Demo.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// JedisPool 工具类
// 加载配置文件 配置连接池参数
// 提供获取连接的方法
public class JedisPoolUtils {

    private static final JedisPool jedisPool;
    // 定义静态代码块  来读取静态文件
    static {
        // 读取配置文件
        InputStream inputStream =
                JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
        // 创建 Properties对象
        Properties properties = new Properties();
        // 关联文件
        try{
            properties.load(inputStream);
        } catch (IOException e){
            e.printStackTrace();
        }
        // 获取数据 设置到 JedisPoolConfig 中
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(Integer.parseInt(properties.getProperty("maxTotal")));
        jedisPoolConfig.setMaxIdle(Integer.parseInt(properties.getProperty("maxIdle")));

        // 初始化JedisPool
        jedisPool =
                new JedisPool(jedisPoolConfig,
                              properties.getProperty("host"),
                              Integer.parseInt(properties.getProperty("post")));
    }

    // 获取连接方法
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

    // 获取关闭方法
    public static void getClose(){
        jedisPool.close();
    }
}
