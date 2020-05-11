public class Triangle {
    double area;
    int height;
    int length;
    public static void main(String [] args){
        //创建了4个由对象组成的数组，为 Triangle[0] 到  Triangle[3]  内存未分配
        Triangle[] ta = new Triangle[4];
        int x = 0;
        while(x < 4){
            //一定要给创建的对象分配内存，通过new为每个对象申请内存
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ",area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    void setArea(){
        area = (height * length) / 2;
    }
}