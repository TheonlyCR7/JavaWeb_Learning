package test4;

public class Merry extends cat{
    @Override
    public void sound(){
        System.out.println("Merry~~~");
        super.sound();
    }

    public void sleep(){
        System.out.println("Zzzzz");
    }
}
