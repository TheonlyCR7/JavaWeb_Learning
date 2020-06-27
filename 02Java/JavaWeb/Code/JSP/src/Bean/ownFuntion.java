package Bean;

public class ownFuntion {

    public static String filter(String message) {

        if (message == null)
            return (null);

        char[] content = new char[message.length()];
        message.getChars(0, message.length(), content, 0);
        StringBuilder result = new StringBuilder(content.length + 50);
        for (char c : content) {
            switch (c) {
                case '<' -> result.append("&lt;");
                case '>' -> result.append("&gt;");
                case '&' -> result.append("&amp;");
                case '"' -> result.append("&quot;");
                default -> result.append(c);
            }
        }
        return (result.toString());

    }
}
