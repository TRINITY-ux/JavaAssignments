import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        int factorial = 1;
        while (num > 0) {
            factorial *= num;
            num--;
        }

        System.out.println("Factorial: " + factorial);
    }
}
