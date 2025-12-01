import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class Person {
    String name, city;
    int age;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;

    }

    public void display() {
        System.out.printf("%-15s %-15s %d\n", name, city, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class read {
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
