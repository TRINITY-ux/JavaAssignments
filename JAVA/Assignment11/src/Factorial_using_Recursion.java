import java.util.Scanner;
public class Factorial_using_Recursion {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int n = sc.nextInt();
         //int n = factorial(n);

        if(n < 0){
            System.out.println("Invalid number . Enter a positive number");
            return;
        }
        int factorialResult = factorial(n);
        System.out.println("Factorial of " + n + " is " + factorialResult);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;

        }else {
            return n * factorial(n-1);
        }


    }
}
