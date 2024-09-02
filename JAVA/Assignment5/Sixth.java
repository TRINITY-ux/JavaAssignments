import java.util.Scanner;
public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the street: ");
        String street = sc.nextLine();

        System.out.println("Enter the city: ");
        String city = sc.nextLine();

        System.out.println("Enter the zip code: ");
        String zipCode = sc.nextLine();

        String formattedAddress = street + "\n" + city + ", " + zipCode;

        System.out.println("The formatted address is:");
        System.out.println(formattedAddress);
    }
}
