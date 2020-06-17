package Cookie;

import java.util.LinkedHashMap;

public class main {
    private static LinkedHashMap<String, Book> linkedHashMap = new LinkedHashMap();


    //简化开发复杂度，book的id和商品的id相同
    static {
        linkedHashMap.put("1", new Book("1", "javaweb", "zhong"));
        linkedHashMap.put("2", new Book("2", "java", "fu"));
        linkedHashMap.put("3", new Book("3", "oracle", "cheng"));
        linkedHashMap.put("4", new Book("4", "mysql", "ou"));
        linkedHashMap.put("5", new Book("5", "ajax", "zi"));
    }

    //获取到所有书籍
    public static LinkedHashMap getAll() {
        return linkedHashMap;
    }
}
