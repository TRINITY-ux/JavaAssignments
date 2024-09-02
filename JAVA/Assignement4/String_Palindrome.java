import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check for palindrome: ");
        String input = sc.nextLine();

        boolean palindrome = isPalindrome(input);

        if (palindrome) {
            System.out.println(input + " :"  +"The string is palindrome");
        }
        else {
            System.out.println(input +  " : " +"The string is not palindrome");
        }

    }
    public static boolean isPalindrome(String input) {
//        input = input.replaceAll(" ", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
