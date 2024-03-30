package test5;

public interface cat {
    static void sound(){
        System.out.println("miaomiao");
    }

    // 默认方法
    default void sleep(){
        System.out.println("Zzzz");
    }
}
