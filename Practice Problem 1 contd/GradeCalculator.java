import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String args[])
    {
        System.out.println("Enter marks: ");

        int x;

        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();

        if (x >= 0 && x <= 39)
        {
            System.out.println("F");
        }

        else if (x >= 40 && x <= 59)
        {
            System.out.println("C+");
        }

        else if (x >= 60 && x <= 69)
        {
            System.out.println("B");
        }

        else if (x >= 70 && x <= 79)
        {
            System.out.println("A-");
        }

        else if (x >= 80 && x <= 89)
        {
            System.out.println("A");
        }

        else if (x > 90)
        {
            System.out.println("A+");
        }
    }
    
}
