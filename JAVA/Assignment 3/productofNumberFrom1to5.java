import java.util.Scanner;
public class productofNumberFrom1to5{
    public static void main(String[] args) {
        int product = 1;
        int i = 1;

        while (i <= 5) {
            product *= i;
            i++;
        }

        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}