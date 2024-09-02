import java.util.Scanner;
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number= Scanner.nextInt();

        if(number %2==0){
            System.out.println(number +" is a even number.");
        }
        else{
            System.out.println(number+" is a odd number.");
        }

    }
}
