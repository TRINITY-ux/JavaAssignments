import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("The random number is " + randomNumber);
    }
}
