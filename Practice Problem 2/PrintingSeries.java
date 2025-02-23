import java.util.Scanner;

public class PrintingSeries 
{
    public static void main(String args[])    
    {
        System.out.println("Printing using for loop: ");

        for (int i = 2; i <= 20; i += 2)
        {
            if (i == 20)
            {
                System.out.println(i);
            }

            else
            {
                System.out.print(i + ",");
            }
        }

        for (int i = 1; i <= 19; i += 2)
        {
            if (i == 19)
            {
                System.out.println(i);
            }

            else
            {
                System.out.print(i + ",");
            }
        }

        System.out.println();

        System.out.println("Printing using while loop: ");

        int i = 2;

        while (i <= 20)
        {
            if (i == 20)
            {
                System.out.println(i);
            }

            else
            {
                System.out.print(i + ",");
            }

            i += 2;
        }

        i = 1;

        while (i <= 19)
        {
            if (i == 19)
            {
                System.out.println(i);
            }

            else
            {
                System.out.print(i + ",");
            }

            i += 2;
        }

        i = 2;

        System.out.println();

        System.out.println("Printing using do while loop: ");

        do
        {
            if (i == 20)
            {
                System.out.println(i);
            }

            else
            {
                System.out.print(i + ",");
            }

            i += 2;
        }
        while (i <= 20);

        i = 1;

        do
        {
            if (i == 19)
            {
                System.out.println(i);
            }

            else
            {
                System.out.print(i + ",");
            }

            i += 2;
        }
        while (i <= 19); 
    }
}
