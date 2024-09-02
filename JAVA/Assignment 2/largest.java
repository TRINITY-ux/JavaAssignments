import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the three number:");
        int num1 = Scanner.nextInt();
        int num2 = Scanner.nextInt();
        int num3 = Scanner.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.print("The 1st number is the greatest among three.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("The 2nd number is the greatest among three.");
        }else{
            System.out.print("the 3rd  number is the greatest among three.");
        }
    }
}
