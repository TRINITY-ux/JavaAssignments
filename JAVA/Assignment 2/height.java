import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the height:" );
        int height = Scanner.nextInt();

        if (height < 150){
            System.out.print("The person is dwarf.");
        } else if (height >=150 && height <= 165) {
            System.out.print("The person is of Average height.");

        }else{
            System.out.print("The person is tall.");
        }
    }
}
