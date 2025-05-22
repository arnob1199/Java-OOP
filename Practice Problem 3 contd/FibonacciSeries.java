public class FibonacciSeries {
    public static void main(String[] args) {

        int first = 0;

        int second = 1;

        System.out.print(first + ", " + second);

        int next = first + second;

        while (next <= 89) {

            System.out.print(", " + next);

            first = second;

            second = next;
            
            next = first + second;
        }
    }
}
