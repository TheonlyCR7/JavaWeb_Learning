package test12;

public class mul {
    public static void main(String[] args) {
        int num = mul_num(4);
        System.out.println(num);
    }

    public static int mul_num(int num){
        if(num == 1) return 1;
        return num * mul_num(num-1);
    }
}
