import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

record Employees(String name, int age, String city){
    @Override
    public String toString(){
        return "%-15s %-10s %d" .formatted(name, city, age);
    }
}
public class record01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("person_list.csv");
        List<Person> people = Files.lines(path)
                .skip(1)
                .map(line -> line.split(","))
                .map(parts -> new Person(parts[0], Integer.parseInt(parts[1]), parts[2]))
                .toList();
        people.forEach(Person::display);
    }
}
