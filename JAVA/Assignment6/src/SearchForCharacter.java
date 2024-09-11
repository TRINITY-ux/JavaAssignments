
import java.util.Scanner;
public class SearchForCharacter {
    public static void main(String[]ages){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = Scanner.nextLine();

        System.out.println("Enter a character to search for:");
        char searchChar = Scanner.next().charAt(0);

        boolean found = false;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                System.out.println("Character '" + searchChar + "' found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Character not found in the string.");
        }
    }
}
