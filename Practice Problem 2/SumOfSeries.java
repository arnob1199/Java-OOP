import java.util.Scanner;

public class SumOfSeries 
{
    public static void main(String[] args) 
    {        
        int sum = 0;

        for (int i = 2; i <= 20; i += 2)
        {
            sum += i;
        }

        System.out.println("The sum of the first series is: ");

        System.out.println(sum);

        sum = 0;

        for (int i = 1; i <= 19; i += 2)
        {
            sum += i;
        }

        System.out.println("The sum of the second series is: ");

        System.out.println(sum);
    }    
}
