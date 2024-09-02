import java.util.Scanner;
public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        String s = sc.nextLine();
        System.out.println("Enter the second string");
        String t = sc.nextLine();

        boolean isEqual = s.equals(t);
        System.out.println(isEqual ?"Concatenated:"  + "YES" : "NO");

    }
}
