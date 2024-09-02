import java.util.Scanner;
public class voteingEligibility {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the age:" );
        int age = Scanner.nextInt();

        if (age >=18){
            System.out.print("eligible to vote");
        }else{
            System.out.print("not eligible to vote");
        }
    }
}
