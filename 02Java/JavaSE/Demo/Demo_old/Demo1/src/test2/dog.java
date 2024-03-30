package test2;

public interface dog<E>{
    public abstract void setName(E name);
    public abstract void setAge(int age);
    public abstract E getName();
    public abstract int getAge();
}
