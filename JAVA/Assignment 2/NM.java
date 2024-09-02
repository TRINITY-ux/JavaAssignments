import java.util.Scanner;
public class NM {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the value of m :");
        int m = Scanner.nextInt();

        int n;

        if (m >0){
            n = 1;
        } else if (m == 0) {
            n=0;
        }else{
            n = -1;
        }
        System.out.print("The value of n:"+n);
    }
}
