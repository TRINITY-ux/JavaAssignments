import  java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first sentence");
        String name = sc.nextLine();
        System.out.println("Enter the second Sentence:");
        int second = sc.nextInt();
        System.out.println("Enter the moral of the sentence:");
        String moral = sc.nextLine();

        String sentence = name + " " +second+ " " +moral + ".";
        System.out.print(sentence);


    }
}
