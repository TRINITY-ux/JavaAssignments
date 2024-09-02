import java.util.Scanner;

public class TransposeMatrix {
        public static void main(String[]args){
            Scanner Scanner = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            int[][] transpose = new int[3][3];
            System.out.println("Enter the element of the 3*3 matrix:");
            for (int i = 0 ; i < 3;i++){
                for (int j = 0 ; j < 3;j++){
                    matrix[i][j] = Scanner.nextInt();
                }
            }

            for (int i = 0 ; i < 3;i++) {
                for (int j = 0; j < 3; j++) {
                    transpose[i][j] = matrix[i][j] ;
                }
            }
            System.out.println("The transpose of a matrix is:");
            for (int i = 0; i < 3;i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


