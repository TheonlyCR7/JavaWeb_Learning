import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TEXT1 {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

// 以前的循环方式
//        for (String player : players) {
//            System.out.print(player + "; ");
//        }

// 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));

// 在 Java 8 中使用双冒号操作符(double colon operator)
        //players.forEach(System.out::println);

        String[] playerss = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

// 1.1 使用匿名内部类根据 name 排序 players
//        Arrays.sort(playerss, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return (s1.compareTo(s2));
//            }
//        });
//        System.out.println(playerss);
//        System.out.println(Arrays.toString(playerss));

        // 1.2 使用 lambda expression 排序 players
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(playerss, sortByName);

// 1.3 也可以采用如下形式:
        Arrays.sort(playerss, (String s1, String s2) -> (s1.compareTo(s2)));

        System.out.println(playerss);
        System.out.println(Arrays.toString(playerss));
    }
}
