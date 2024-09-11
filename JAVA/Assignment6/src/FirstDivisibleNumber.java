import java.util.Scanner;
public class FirstDivisibleNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 4 == 0) {
                System.out.println("The first number divisible by both 5 and 4 is: " + i);
                break;
            }
        }
    }
}