package Arrays.com;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] arr1=new int[row][col];
        int [][] arr2=new int[row][col];
        System.out.println("Enter the elements of first array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                arr1[i][j]=sc.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                arr2[i][j]=sc.nextInt();
        }
        int[][] result=new int[row][col];
        System.out.println("Result");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
