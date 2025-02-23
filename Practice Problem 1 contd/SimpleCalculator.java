import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integer a: ");

        int a = scan.nextInt();

        System.out.println(("Enter integer b: "));

        int b = scan.nextInt();

        System.out.println("Enter an operation: ");
        
        char c = scan.next().charAt(0);

        if (c == '+')
        {
            System.out.println(a + b);
        }

        else if (c == '-')
        {
            System.out.println(a - b);
        }

        else if (c == '*')
        {
            System.out.println(a * b);
        }

        else if (c == '/')
        {
            System.out.println(a / b);
        }
    }
    
}
