public class Ex5 
{
    public static long facorialIter(int n)
    {
        long f = 1;
        for (int i = 1; i <= n; i++) 
            {
                f *= i;
            }
        return f;
    }
    
    public static long factorialRec(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        return n * factorialRec(n - 1);
    }

    public static void main(String[] args)
    {
        int input[] = {3, 6, 10, 50};

        for (int n : input)
        {
            System.out.println("n = " + n);
            System.out.println("Interactive = " + facorialIter(n));
            System.out.println("Recursive = " + factorialRec(n));
            System.out.println();
        }
    }
}
