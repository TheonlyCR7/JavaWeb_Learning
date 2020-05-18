public class Demo05InvokeCook {
    public static void main(String[] args) {
        invokeCook(() -> {
            System.out.println("吃饭啦！");
        });
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
