package test12;

public class plus {
    public static void main(String[] args) {
        int num_n = get_sum(5);
        System.out.println(num_n);
    }

    public static int get_sum(int num){
        if(num == 1) return 1;
        return num + get_sum(--num);
    }
}
