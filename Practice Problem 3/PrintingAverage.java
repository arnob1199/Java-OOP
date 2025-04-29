public class PrintingAverage
{
    public static void main(String args[])
    {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int avg = 0;

        for (int i = 0; i < 10; i++)
        {
            avg += arr[i];
        }

        avg /= 10;

        System.out.println("The average of the numbers in the array is = " + avg);
    }
}
