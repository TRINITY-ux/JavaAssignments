import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a leap year:");
        int leapYear = Scanner.nextInt();

        if((leapYear % 4 == 0 && leapYear % 100 !=0) ||(leapYear % 400 ==0) ){
            System.out.print(leapYear +"is a leap year");
        }else{
            System.out.print(leapYear + "is not a leap year");
        }
    }
}
