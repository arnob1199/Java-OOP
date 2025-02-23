import java.util.Scanner;

public class AreaOfEquilateralTriangle 
{
    public static void main(String args[])
    {
        System.out.println("Enter the length of the sides of the triangle: ");

        Scanner scan = new Scanner(System.in);

        double side;

        side = scan.nextDouble();

        double x = (Math.sqrt(3) / 4) * side * side;

        System.out.println("The area of the equilateral triangle is: " + x);
        
    }


}
