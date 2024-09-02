import java.util.Scanner;
public class positiveInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        while (true) {
            System.out.print("Enter a positive integer (0 to stop): ");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num > 0) {
                sum += num;
            }
        }

        System.out.println("Sum of positive integers: " + sum);
    }
}


