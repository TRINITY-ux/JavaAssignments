import java.util.Scanner;
public class positiveNegative {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = Scanner.nextInt();

        if (number > 0){
            System.out.print(number +"is a positive");
        } else if (number < 0){
            System.out.print(number +"is a negative");

        }
        else {
            System.out.print(number +"is zero");
        }
    }
}
