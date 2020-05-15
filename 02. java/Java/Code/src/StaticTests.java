public class StaticTests extends StaticSuper{
    static int rand;

    // 在类载入前已经初始化
    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block  " + rand);
    }
    StaticTests(){
        System.out.println("constructor");
    }

    public static void main(String[] args){
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }

}
