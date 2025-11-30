public class Ex1
{
    public static void main(String[] args) {
        {
            int sum = 0;

            for (int i = 1; i <= 100; i ++)
            {
                if (i % 2 == 0)
                {
                    sum += i;
                }
            }

            System.out.print("The sum from 1 to 100 is: " + sum);
        }
    }
}