import java.util.Scanner;

public class LeapYearChecker 
{
    public static void main(String args[])    
    {
        Scanner scan = new Scanner(System.in);

        int y;

        System.out.println("Enter the year: ");

        y = scan.nextInt();

        if (y % 4 == 0)
        {
            System.out.println("The year is a leap year");
        }

        else 
        {
            System.out.println("The year is not a leap year");
        }
    }
}
