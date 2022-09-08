import java.sql.SQLOutput;
import java.util.Scanner;
public class MatrixString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,m;
        System.out.println("Введите размерность матрицы:");
        n=scanner.nextInt(); m=scanner.nextInt();
        System.out.println("Введите элементы матрицы:");
        int [][] matrix=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int randNumber=(int)(Math.random() * 10+0);
                matrix[i][j]=randNumber;
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print(" \n");
        }
        System.out.println("Введите номер строки:");
        int s;
        s=scanner.nextInt();





        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = matrix[s][n-i-1];
            matrix[s][n-i-1] = matrix[s][i];
            matrix[s][i] = temp;
        }




        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print(" \n");
        }
    }
}