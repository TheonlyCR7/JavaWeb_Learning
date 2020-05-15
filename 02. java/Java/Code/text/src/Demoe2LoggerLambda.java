public class Demoe2LoggerLambda {
    private static void log(int level, MessageBuilder builder) {
        System.out.println(getType(builder));
        if (level == 1) {
            System.out.println(builder.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msgA = "Hel1o";
        String msgB = "World";
        String msgC = "Java";
        log(1, () -> msgA + msgB + msgC);
    }
}
