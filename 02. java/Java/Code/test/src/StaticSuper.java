public class StaticSuper {

    // 在类载入前已经初始化
    static {
        System.out.println("super static block");
    }

    // 引用时，构造函数直接运行
    StaticSuper(){
        System.out.println("super constructor");
    }
}
