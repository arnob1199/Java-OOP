import java.util.Scanner;

public class OccurrenceCounter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");

        String input = scan.nextLine();

        System.out.println("Enter the character to count:");

        char c = scan.next().charAt(0);     

        int cnt = 0;
        
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == c) {

                cnt++;
            }
        }

        System.out.println("The character '" + c + "' appears " + cnt + " times");
    }
    
}
