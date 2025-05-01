import java.util.Scanner;
public class PrimeChecker 
{
    public static void main(String args[])
    {
        System.out.println("Enter a number: ");

        int num;

        int flag = 0;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                System.out.println("The given number is not a prime number");

                flag = 1;

                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("The given number is a prime number");
        }
    }
}
