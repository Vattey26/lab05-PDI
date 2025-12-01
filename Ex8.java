import java.io.*;
import java.util.*;

class SumRunnable implements Runnable
{
    private int n;
    public SumRunnable(int n)
    {
        this.n = n;
    }

    public void run()
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + "= " + sum);
    }
}

class PrimeRunnable implements Runnable
{
    public void run()
    {
        System.out.print("Prime from 1 to 100: ");
        for (int i = 2; i <= 100; i++)
        {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    prime = false;
                    break;
                }
                if (prime)
                {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}

class CSVRunnable implements Runnable
{
    private String filename;
    public CSVRunnable (String filename)
    {
        this.filename = filename;
    }

    public void run()
    {
        List<String[]> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                students.add(line.split(","));
            }
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        System.out.println("\nStudents loaded from CSV: " + students.size());
    }
}

public class Ex8 {
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new SumRunnable(100));
        Thread t2 = new Thread(new PrimeRunnable());
        Thread t3 = new Thread(new CSVRunnable("student.csv"));
        
        t1.start();
        t2.start();
        t3.start();
    }
}
