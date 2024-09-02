import java.util.Scanner;
public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Error: Square root of a negative number is not a real number.");
        } else {
            double squareRoot = Math.sqrt(number);
            System.out.printf("The square root of %.2f is %.2f%n", number, squareRoot);
        }
    }
}
