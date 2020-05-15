import java.util.ArrayList;

public class testObject {

    private static ArrayList<String> s1,s2,s3;

    public static void main(String[] strings){


         // 关于对象引用的理解

        s1 = new ArrayList<>();
        s1.add("just");
        s1.add("for");
        s1.add("test");
        for(String string:s1){
            System.out.println("s1:" + string);
        }
        System.out.println("1------------1---------------1");
        s2 = s1;
        for(String string:s2){
            System.out.println("s2:" + string);
        }
        System.out.println("2--------------2-------------2");
        s2.remove(1);
        for(String string:s1){
            System.out.println("s1:" + string);
        }
        System.out.println("3-------------3--------------3");
        testParam(s2);
        System.out.println("4---------------4------------4");
        for(String string:s2){
            System.out.println("s2:" + string);
        }
        System.out.println("5------------5---------------5");
    }


    public static void testParam(ArrayList<String> strings){
        s3 = strings;
        s3.remove(0);
        for(String string:s3){
            System.out.println("s3:" + string);
        }
    }


}
