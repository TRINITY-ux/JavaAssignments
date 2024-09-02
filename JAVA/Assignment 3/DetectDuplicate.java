import java.util.HashSet;
import java.util.Scanner;

public class DetectDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        int num;

        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();

            if (numbers.contains(num)) {
                System.out.println("Duplicate number detected. Terminating...");
                break;
            } else {
                numbers.add(num);
            }
        }
    }
}