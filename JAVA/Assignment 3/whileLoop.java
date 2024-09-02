import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        int i = 0;

        // First loop: Print numbers from 0 to 10
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        i = 10;

        // Second loop: Print numbers from 10 to 0
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}