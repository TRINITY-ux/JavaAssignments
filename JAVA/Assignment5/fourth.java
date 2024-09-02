import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String num1Str = sc.next();

        System.out.print("Enter the second number: ");
        String num2Str = sc.next();

        String concatenated = num1Str + num2Str;

        System.out.println("The concatenated result is: " + concatenated);
    }
}
