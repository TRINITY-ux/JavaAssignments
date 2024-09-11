import java.util.Scanner;
public class SumOfNumbersUntil100ISReached {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            sum += number;

            if (sum >= 100) {
                System.out.println("Sum has reached or exceeded 100. Current sum: " + sum);
                break;
            }
        }
    }
}