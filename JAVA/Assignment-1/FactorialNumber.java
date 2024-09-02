import  java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        int i,fact=1;
        System.out.println("Enter the number for factorial");
        int number= Scanner.nextInt();
        for (i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("factorial = "+fact);
    }
}
