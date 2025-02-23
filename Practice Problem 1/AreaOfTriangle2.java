import java.util.Scanner;

public class AreaOfTriangle2 
{
    public static void main(String args[])
    {
        System.out.println("Enter the length of the sides of the triangle: ");

        Scanner scan = new Scanner(System.in);

        double a, b, c;

        a = scan.nextDouble();

        b = scan.nextDouble();

        c = scan.nextDouble();

        double s = (a + b + c) / 2;

        double ans = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is: " + ans);
    }
}
