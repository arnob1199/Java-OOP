
import java.util.Scanner;

public class GivingBonus
{
    public static void main(String args[])
    {
        System.out.println("Enter percentage of target sales: ");

        int sales;

        Scanner scan = new Scanner(System.in);

        sales = scan.nextInt();

        System.out.println("Enter percentage of attendance: ");

        int attendance;

        attendance = scan.nextInt();

        if (sales == 95 && attendance == 100)
        {
            System.out.println("Bonus amount is 60%");
        }

        else if (sales == 95 && attendance == 90)
        {
            System.out.println("Bonus amount is 40%");
        }

        else if (sales == 80 && attendance == 100)
        {
            System.out.println("Bonus amount is 40%");
        }

        else if (sales == 80 && attendance == 90)
        {
            System.out.println("Bonus amount is 20%");
        }

        else
        {
            System.out.println("Bonus amount is 5%");
        }
    }
}
