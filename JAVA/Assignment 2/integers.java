import java.util.Scanner;
public class integers {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the first integer:");
        int num1 = Scanner.nextInt();
        System.out.print("Enter the second integer:");
        int num2 = Scanner.nextInt();

        if(num1 == num2){
            System.out.print("num1 and num2 is equal");
        }else{
            System.out.print("num1 and num2 is not equal");
        }

    }
}
