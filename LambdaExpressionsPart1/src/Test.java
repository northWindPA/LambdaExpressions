import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");
//        list.sort((o1, o2) -> {
//            if (o1.length() > o2.length()) return 1;
//            else if (o1.length() < o2.length()) return -1;
//            else return 0;
//        });
        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            else return 0;
        };
        list.sort(comparator);
        System.out.println(list);
    }
}

//interface Executable {
//    int execute(int x, int y);
//}
//
//class Runner {
//    public void run(Executable e) {
//        int n = e.execute(10, 20);
//        System.out.println(n);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Runner runner = new Runner();
//        runner.run(new Executable() {
//            @Override
//            public int execute(int x, int y) {
//                System.out.println("Hello");
//                return x + y + 17;
//            }
//        });
//        runner.run((int x, int y) -> {
//            System.out.println("Hello");
//            return x + 5;
//        });
//        final int a = 1;                  //variables out of sight must be constant
//        runner.run((x, y) -> x + y + 10); //there is a lambda-return
//    }
//}
