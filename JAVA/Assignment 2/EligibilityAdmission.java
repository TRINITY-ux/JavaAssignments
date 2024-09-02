import java.util.Scanner;
public class EligibilityAdmission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the marks obtained in Physics, Chemistry, and Mathematics
        System.out.print("Enter marks obtained in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks obtained in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks obtained in Mathematics: ");
        int mathematics = scanner.nextInt();

        // Calculate total marks
        int totalMarks = physics + chemistry + mathematics;
        int mathPhysicsTotal = mathematics + physics;

        // Check eligibility based on given criteria
        if (mathematics >= 65 && physics >= 55 && chemistry >= 50 &&
                (totalMarks >= 190 || mathPhysicsTotal >= 140)) {

        }
    }
}