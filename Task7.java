import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Person class (for CSV data)
class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void display() {
        System.out.printf("%-15s %-15s %d\n", name, city, age);
    }
}

// a) Thread to find sum from 1 to n
class SumThread extends Thread {
    private int n;

    public SumThread(int n) {
        this.n = n;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }
}

// b) Thread to show prime numbers
class PrimeThread extends Thread {
    public void run() {
        System.out.print("Prime numbers (1-100): ");
        for (int i = 2; i <= 100; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
                if (i % j == 0) prime = false;
            if (prime) System.out.print(i + " ");
        }
        System.out.println();
    }
}

// c) Thread to read CSV
class CSVThread extends Thread {
    public void run() {
        try {
            Path path = Paths.get("person_list.csv");

            List<Person> people = Files.lines(path)
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(parts -> new Person(parts[0], Integer.parseInt(parts[1]), parts[2]))
                    .toList();

            System.out.println("\n--- CSV Loaded ---");
            people.forEach(Person::display);

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
        }
    }
}

public class Task7 {
    public static void main(String[] args) {
        new SumThread(20).start();
        new PrimeThread().start();
        new CSVThread().start();
    }
}
