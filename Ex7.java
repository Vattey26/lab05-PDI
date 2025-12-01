import java.io.*;
import java.util.*;

class SumThread extends Thread
{
    private int n;
    public SumThread(int n)
    {
        this.n = n;
    }

    public void Run()
    {
        int sum = 0;
        for (int i= 1; i <= n; i++) 
        {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }
}

class PrimeThread extends Thread{
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
            }
            if(prime)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class CSVThread extends Thread
{
    private String filename;
    public CSVThread(String filename)
    {
        this.filename = filename;
    }

    public void run()
    {
        List<String[]> students = new ArrayList<>();
        try (BufferedReader  br = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while((line = br.readLine()) != null)
            {
                students.add(line.split(","));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Students loaded from CSV: " + students.size());
    }
}

public class Ex7 
{
    public static void main(String[] args) 
    {
        Thread t1 = new SumThread(100);
        Thread t2 = new PrimeThread();
        Thread t3 = new CSVThread("student.csv");

        t1.start();
        t2.start();
        t3.start();
    }
}
