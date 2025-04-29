import java.util.Scanner;

public class GivingMedal 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter grade: ");

        double grad;

        grad = scan.nextDouble();

        System.out.println("Enter semester completion status(if complete enter Y else N):");

        char c;

        c = scan.next().charAt(0);

        if (grad >= 3.5 && c == 'Y')
        {
            System.out.println("Eligible for medal");
        }

        else
        {
            System.out.println("Not eligible for medal");
        }
    }
}
