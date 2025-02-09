import java.util.Scanner    ;

public class AreaOfTriangle 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");

        float base = scan.nextFloat();

        System.out.println("Enter the height of the triangle:");

        float height = scan.nextFloat();

        System.out.println("Area of Triangle = " + 0.5 * base * height);     
    }
    

}