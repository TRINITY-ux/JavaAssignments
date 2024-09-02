import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = calculateArea(r);
        System.out.println("The area of the circle is " + area);
    }
    public static double calculateArea(double r) {
        return Math.PI * r * r;
    }


}
