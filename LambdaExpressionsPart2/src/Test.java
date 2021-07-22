import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArr(array1);
        fillList(list1);
        //map method
        array1 = Arrays.stream(array1).map(x -> x * 2).toArray();
        list1 = list1.stream().map(x -> x * 2).collect(Collectors.toList());

        array1 = Arrays.stream(array1).map(a -> 7).toArray();
        array1 = Arrays.stream(array1).map(a ->a + 1).toArray();

        System.out.println(Arrays.toString(array1));
        System.out.println(list1);

        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArr(array2);
        fillList(list2);

        //forEach
        array2 = Arrays.stream(array2).filter(x -> x % 2 == 0).toArray();
        list2 = list2.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(array2));
        System.out.println(list2);

        Arrays.stream(array2).forEach(x -> System.out.println("arrayElement " + x));
        list2.stream().forEach(x -> System.out.println("listElement " + x));

        //reduce
        int[] array3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(array3);
        fillList(list3);

        int arraySum = Arrays.stream(array3).reduce((acc, x) -> acc + x).getAsInt();
        int listSum = list3.stream().reduce((acc, x) -> acc + x).get();

        System.out.println("arraySum - " + arraySum);
        System.out.println("listSum - " + listSum);

        int[] array4 = new int[10];
        fillArr(array4);
        int[] newArray = Arrays.stream(array4).filter(x -> x % 2 != 0).map(x -> x * 2).toArray();
        System.out.println(Arrays.toString(newArray));

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(i + 1);
        }
        System.out.println(set);
        set = set.stream().map(x -> x * 3).collect(Collectors.toSet());
        System.out.println(set);


    }
    private static void fillArr(int[] array) {
        for (int i = 0; i < 10; i++)
            array[i] = i + 1;
    }
    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++)
            list.add(i + 1);
    }
}
