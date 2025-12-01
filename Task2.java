import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sum from 1 to n");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    System.out.println("Result = " + (sc.nextDouble() + sc.nextDouble()));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    System.out.println("Result = " + (sc.nextDouble() - sc.nextDouble()));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    System.out.println("Result = " + (sc.nextDouble() * sc.nextDouble()));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Error: Division by zero!");
                    break;

                case 5:
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= n; i++)
                        sum += i;
                    System.out.println("Sum from 1 to " + n + " = " + sum);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 6);

        sc.close();
    }
}
