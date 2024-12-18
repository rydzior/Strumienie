import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,2,8,16,24,9,20,4,1,6,11,100);

        list.stream().
                map(i -> i * i).
                map(i -> i + 9).
                map(i -> i + "").
                filter(i -> !i.contains("9")).
                forEach(System.out::println);
    }
}
