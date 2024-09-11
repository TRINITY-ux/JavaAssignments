public class RecursiveSumofDigits {

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        // Test the sumOfDigits method
        int number = 1234;
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is " + sum);
    }
}