import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-5, 9, 0, 3, -8, 10);
        nums.stream()
            .filter(n -> n > 0)
            .forEach(System.out::println);
    }
}
