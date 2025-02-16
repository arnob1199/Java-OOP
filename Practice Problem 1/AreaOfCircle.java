import java.util.Scanner;

public class AreaOfCircle 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = scan.nextDouble();

        double area = 3.1416 * radius * radius;

        System.out.println("The area of the circle is: " + area);
        
    }
}
