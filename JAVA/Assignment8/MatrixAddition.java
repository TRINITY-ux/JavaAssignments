import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];
        System.out.println("Enter the element of the first 2*2 matrix:");
        for (int i = 0 ; i < 2;i++){
            for (int j = 0 ; j < 2;j++){
                matrix1[i][j] = Scanner.nextInt();
            }
        }
        System.out.println("Enter the element of the second 2*2 matrix:");
        for (int i = 0 ; i < 2;i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = Scanner.nextInt();
            }
        }
        for (int i = 0 ; i < 2;i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The resulting matrix is:");
        for (int i = 0; i < 2;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
