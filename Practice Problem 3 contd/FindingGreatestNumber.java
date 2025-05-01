public class FindingGreatestNumber 
{
    public static void main (String args[])
    {
        int arr[] = {10, 8, 5, 345, 3476, 238, 2938478, 556, 2938478, 29};

        int max = 0;

        for (int i = 0; i < 9; i++)
        {
            if (arr[i] > arr[i + 1] && arr[i] > max)
            {
                max = arr[i];
            }

            else if (arr[i + 1] > max)
            {
                max = arr[i + 1];
            }
        }

        System.out.println("The greatest number in the series is: " + max);
    }
}