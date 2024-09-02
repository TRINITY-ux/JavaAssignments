import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a reverse number:");
        int reverse = Scanner.nextInt();

        int reversedNumber = 0;
        while (reverse!= 0){
            int digit = reverse % 10;
            reversedNumber = reversedNumber * 10 + digit;
            reverse /=10;

        }
        System.out.println("reversed number:"+reversedNumber);
        Scanner.close();
    }
}
