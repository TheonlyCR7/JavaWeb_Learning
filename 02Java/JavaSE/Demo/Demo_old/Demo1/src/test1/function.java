package test1;

public class function {
    public static void main (String[] args){
        dog one = new dog();
        one.setsize(70);
        //修改one对象的属性 size
//        one.size = 20;
        System.out.println(one.getsize());
    }
}
//其他类要在主类后面
class dog {
    //实例变量在类中定义
    //实例变量不赋值时，也是有值的
    //使用private  将变量私有化，安全
    private int size;
    public int getsize() {
        //局部变量在函数中定义，不赋值没有值，必须初始化
        String bad;
        return size;
    }
    //主函数的变量无法共享
    public void setsize(int si) {
        size = si;
    }
}
