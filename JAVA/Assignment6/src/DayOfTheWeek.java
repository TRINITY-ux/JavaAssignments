
import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number(1-7):");
        int day = Scanner.nextInt();
        String DayName;

        switch (day){
            case 1:
                DayName = "Monday";
                break;
            case 2:
                DayName = "tuesday";
                break;
            case 3:
                DayName = "wednesday";
                break;
            case 4:
                DayName = "thrusday";
                break;
            case 5:
                DayName = "friday";
                break;
            case 6:
                DayName = "saturday";
                break;
            case 7:
                DayName = "sunday";
                break;
            default:
                DayName = "inviled";
                break;

        }
        System.out.println("the day is."+DayName);
    }
}