package test1;

import java.util.ArrayList;
import java.util.Collection;

public class collect {
    public static void main(String[] args) {
        // 创建集合对象
        // 使用多态形式
        Collection<String> coll = new ArrayList<String>();
        // 使用方法
        // 添加功能  boolean  add(String s)
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);

        // boolean contains(E e) 判断o是否在集合中存在
        System.out.println("判断  扫地僧 是否在集合中"+coll.contains("扫地僧"));

        //boolean remove(E e) 删除在集合中的o元素
        System.out.println("删除石破天："+coll.remove("石破天"));
        System.out.println("操作之后集合中元素:"+coll);

        // size() 集合中有几个元素
        System.out.println("集合中有"+coll.size()+"个元素");

        // Object[] toArray()转换成一个Object数组
        Object[] objects = coll.toArray();
        // 遍历数组
        for (Object object : objects) {
            System.out.println(object);
        }

        // void  clear() 清空集合
        coll.clear();
        System.out.println("集合中内容为："+coll);
        // boolean  isEmpty()  判断是否为空
        System.out.println(coll.isEmpty());
    }
}
