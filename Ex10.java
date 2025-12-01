import java.util.*;

public class Ex10 
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        numbers.stream()
               .filter(n -> n > 0)
               .forEach(System.out::println);
    }    
}
