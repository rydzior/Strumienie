import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<String> list = List.of("yy","abc","dey","ghi","yjky","myyno","yyyyyyy","ybycys","dasyyday","a");

        list.stream().
                map(s -> s + "y").
                filter(s -> !s.contains("yy")).
                forEach(System.out::println);
    }
}
