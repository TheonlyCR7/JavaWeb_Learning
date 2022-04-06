package test12;

public class nnn {
    public static void main(String[] args) throws Exception {
         a();
        b(1);
    }

    // 构造方法,禁止递归
    // 编译报错:构造方法是创建对象使用的,不能让对象一直创建下去
    public nnn() {
        //Demo01DiGui();
    }


    // 不可递归太多层 也有可能溢出
    private static void b(int i) {
        System.out.println(i);
        //添加一个递归结束的条件,i==5000的时候结束
        if(i==5000){
            return;//结束方法
        }
        b(++i);
    }

    // 无结束条件 发生溢出
    private static void a(){
        System.out.println("a方法");
        a();
    }
}
