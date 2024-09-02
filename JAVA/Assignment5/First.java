import  java.util.Scanner;
public class First {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println("Your full name is: " + fullName);
    }

}