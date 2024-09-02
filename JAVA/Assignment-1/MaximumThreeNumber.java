import java.util.Scanner;
public class MaximumThreeNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int num1=Scanner.nextInt();
        System.out.println("Enter the Second number:");
        int num2=Scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3=Scanner.nextInt();

        int max = num1;

        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        System.out.println("maximum number:"+max);
    }
}
