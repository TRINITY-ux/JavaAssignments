import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = Scanner.nextInt();

        if(number % 2 == 0){
            System.out.print(number +"is an even integer");
        }else{
            System.out.print(number +"is an odd integer");
        }
    }
}
