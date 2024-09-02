import java.util.Scanner;
public class Nineth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int number = sc.nextInt();

        boolean isGreater = number > 100;

        if (isGreater) {
            System.out.println("Greater Number than 100");
        }
        else {
            System.out.println("Not Greater Number than 100");
        }

    }
}
