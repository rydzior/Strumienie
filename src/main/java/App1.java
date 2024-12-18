import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,32,42,19,7,37,21,99,100,123,149,177);

        double average = list.stream().
                filter(i -> !(i % 10 == 7 || i % 10 == 9)).
                mapToDouble(i -> i).
                average().
                orElse(0.0);
        System.out.println("Średnia: " + average);
    }
}
