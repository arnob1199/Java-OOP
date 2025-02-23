import java.util.Scanner;

public class ParityChecker 
{
    public static void main(String args[])
    {
        System.out.println("Enter an integer: ");

        Scanner scan = new Scanner(System.in);

        int x;

        x = scan.nextInt();

        if (x % 2 == 0)
        {
            System.out.println("The integer is even");
        }

        else
        {
            System.out.println("The integer is odd");
        }
    }
}
