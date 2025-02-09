import java.util.Scanner;

public class VolumeOfBall 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the ball: ");

        double radius = scan.nextDouble();

        double x = (4.0 / 3.0) * 3.1416;

        radius = radius * radius * radius;

        System.out.println("The volume of the ball is: " + x * radius);
    }
    
}
