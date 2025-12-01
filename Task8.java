import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// a) Runnable sum
class SumTask implements Runnable {
    private int n;

    public SumTask(int n) {
        this.n = n;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }
}

// b) Runnable prime
class PrimeTask implements Runnable {
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

// c) Runnable CSV reader
class CSVTask implements Runnable {
    public void run() {
        ArrayList<String> students = new ArrayList<>();
        try {
            File f = new File("person_list.csv");
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine())
                students.add(sc.nextLine());
            sc.close();

            System.out.println("Students loaded: " + students.size());

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        new Thread(new SumTask(15)).start();
        new Thread(new PrimeTask()).start();
        new Thread(new CSVTask()).start();
    }
}
