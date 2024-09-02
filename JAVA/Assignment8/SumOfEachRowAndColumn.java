import java.util.Scanner;
public class SumOfEachRowAndColumn {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[]row = new int[3];
        int[]column = new int[3];
        System.out.println("Enter the element of the 3*3 matrix:");
        for (int i = 0 ; i < 3;i++){
            for (int j = 0 ; j < 3;j++){
                matrix[i][j] = Scanner.nextInt();
            }
        }
        for (int i = 0 ; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                row[i] += matrix[i][i];
                column[i] += matrix[i][i];
            }
        }
        System.out.println("sum of row:");
        for (int i = 0 ; i < 3;i++) {
            System.out.println("row"+(i+1)+" :"+ row[i]);
        }
        System.out.println("sum of column:");
        for (int j = 0 ; j < 3;j++) {
            System.out.println("column"+(j+1)+" :"+ column[j]);
        }
    }
}
