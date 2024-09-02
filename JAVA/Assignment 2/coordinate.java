import java.util.Scanner;

public class coordinate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the x and y coordinates
        System.out.print("Enter the coordinates (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Determine the quadrant
        if (x > 0 && y > 0) {
            System.out.println("The coordinate point (" + x + ", " + y + ") lies in the First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate point (" + x + ", " + y + ") lies in the Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point (" + x + ", " + y + ") lies in the Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate point (" + x + ", " + y + ") lies in the Fourth quadrant");
        } else {
            System.out.println("The coordinate point (" + x + ", " + y + ") lies on the origin or one of the axes");
        }
    }
}
