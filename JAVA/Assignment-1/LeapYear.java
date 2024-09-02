import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a check leap year:");
        int  year = Scanner.nextInt();
        if ((year % 4 == 0 && year % 100 !=0)||(year % 400 == 0)){
            System.out.println(year + " is a leap year.");

        }else{
            System.out.println(year + " is a not leap year");
        }
    }
}
