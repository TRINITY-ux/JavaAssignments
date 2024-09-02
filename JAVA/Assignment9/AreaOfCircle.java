import java.util.Scanner;
public class AreaOfCircle {
    public static double calculateArea(double radius){
        return Math.PI *radius *radius;
    }
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius = Scanner.nextDouble();
        double Area = calculateArea(radius);
        System.out.println("the area of the circle:"+ Area);
    }
}
