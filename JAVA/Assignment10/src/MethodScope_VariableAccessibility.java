public class MethodScope_VariableAccessibility {
    public static void main(String[] args) {
        int result = sum(5, 7);
        System.out.println("Sum: " + result);

        multiply(9, 4);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {

        int localResult = a * b;
        System.out.println("Product: " + localResult);
        return localResult;
    }
}