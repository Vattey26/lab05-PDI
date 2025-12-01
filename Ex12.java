import java.io.*;
import java.util.*;

public class Ex12 
{
    public static void main(String[] args) throws IOException
    {
        List<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("student.csv"))){
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");
                names.add(data[0]);
            }
        }
        names.stream().sorted().forEach(System.out::println);    
    }    
}
