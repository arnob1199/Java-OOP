import java.util.Scanner;

public class CelciusToFahrenheitConversion 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Celsius temperature: ");

        double c = scan.nextDouble();

        double f = (c * 9) / 5 + 32; 
        
        System.out.println("Temperature in Fahrenheit is: " + f);
    }
}
