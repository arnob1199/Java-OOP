import java.util.Scanner;

public class PostiveIntegerChecker
{
    public static void main(String args[])
    {
        System.out.println("Enter an integer: ");
        
        Scanner scan = new Scanner(System.in);

        int x;

        x = scan.nextInt();

        if(x > 0)
        {
            System.out.println("The integer is positive");
        }

        else if (x < 0)
        {
            System.out.println("The integer is negative");
        }

        else
        {
            System.err.println("The integer is Zero");
        }
    }

}
