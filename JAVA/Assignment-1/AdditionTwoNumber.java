import java.util.Scanner;
public class AdditionTwoNumber {
    public static void main(String[]args){
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Enter the First number:");
        int num1=Scanner.nextInt();
        System.out.println("Enter the Second number:");
        int num2=Scanner.nextInt();

        int sum = num1+num2;
        System.out.println("sum of number:"+ sum);
    }

}
