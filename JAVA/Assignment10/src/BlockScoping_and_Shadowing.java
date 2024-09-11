public class BlockScoping_and_Shadowing {
    public static void main(String[] args) {
        calculate();
        int x = 20;
    }

    public static void calculate() {
        int x = 10;
        System.out.println("Value of x outside the loop: " + x);

        for (int i = 0; i < 5; i++) {

            System.out.println("Value of x inside the loop: " + x);
        }

        System.out.println("Value of x outside the loop after the loop: " + x);
    }
}