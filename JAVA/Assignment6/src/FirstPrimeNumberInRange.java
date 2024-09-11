import java.util.Scanner;
public class FirstPrimeNumberInRange {
    public static void main(String[]args){
        for (int i = 5;i<=100;i++){
            boolean isprime = true;

            for (int j = 5;j <=i/5;i++){
                if(i%j ==0){
                    isprime = false;
                    break;
                }
            }
            if (isprime){
                System.out.println("The first prime number in the range is:"+i);
                break;
            }
        }
    }

}