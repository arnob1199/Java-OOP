import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");

        int n = scanner.nextInt();

        int arr[] = new int[n];

        int oddCount = 0;

        int evenCount = 0;

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0) {

                evenCount++;
            } 
            else {

                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        
        System.out.println("Total Odd Numbers: " + oddCount);

        scanner.close();
    }
}
