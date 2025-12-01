import java.util.Scanner;

interface Operation
{
    void Execute();
}

class Add implements Operation
{
    @Override
    public void Execute() 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input two number: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        
        System.out.printf("The Sum= %-2f", a + b);
    }
}

class Substract implements Operation
{
    @Override
    public void Execute()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input two number: ");

        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.printf("The result= %-2f", a - b);
    }
}

class Multiply implements Operation
{
    @Override
    public void Execute()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input two number: ");

        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.printf("The result= %-2f", a * b);
    }
}

class Divide implements Operation
{
    @Override
    public void Execute()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input two numbers: ");

        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.printf("The result= %-2f", a / b);
    }
}

class SumToN implements Operation
{
    @Override
    public void Execute()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++)
        {
            total += i;
        }

       System.out.printf("Sum from 1 to %d = %d\n", n, total);
    }
}

public class Ex2 
{
    public static void main(String[] args) {
        {
            Scanner scan = new Scanner(System.in);

            while (true) 
            { 
                System.out.print("========== Calculator ==========\n");
                System.out.print("1. Addition.\n");
                System.out.print("2. Substraction.\n");
                System.out.print("3. Multiplication\n");
                System.out.print("4. Division.\n");
                System.out.print("5. Sum from 1 to n.\n");
                System.out.print("6. Exit.\n");

                System.out.print("Choice: ");

                int choice = scan.nextInt();
                Operation op = null;

                if (choice == 6)
                {
                    break;
                }

                switch (choice)
                {
                    case 1 -> op = new Add();
                    case 2 -> op = new Substract();
                    case 3 -> op = new Multiply();
                    case 4 -> op = new Divide();
                    case 5 -> op = new SumToN();
                }

                if (op != null) 
                {
                    op.Execute();
                }
                System.out.println();
            }
            scan.close();
        }
    }    
}