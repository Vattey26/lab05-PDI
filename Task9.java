import java.util.Arrays;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        nums.stream()
            .map(n -> n * n * n)   
            .forEach(System.out::println);
    }
}
