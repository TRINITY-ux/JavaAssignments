import java.util.Scanner;
public class SkipNegativeNumberInInput {
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a number (0 to exit):");
            int number = Scanner.nextInt();
            if(number == 0){
                break;
            }
            if (number < 0){
                continue;
            }
            sum += number;
        }
        System.out.println("the sum of positive number is :"+sum);
    }
}