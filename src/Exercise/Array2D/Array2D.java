package Exercise.Array2D;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows: ");
         int r=input.nextInt();
        System.out.println("Enter columns ");
        int c= input.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.println( (i+1) + ":" + (j+1));
                matrix[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }
}
