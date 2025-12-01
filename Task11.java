import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
