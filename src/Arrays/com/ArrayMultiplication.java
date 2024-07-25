package Arrays.com;

import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in first matrix");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int [][] arr1=new int[row1][col1];
        System.out.println("Enter the number of rows and columns in second matrix");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int [][] arr2=new int[row2][col2];
        System.out.println("Enter the elements of first array");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++)
                arr1[i][j]=sc.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++)
                arr2[i][j]=sc.nextInt();
        }
        int[][] result=new int[row1][col2];
        if(col1==row2){
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    result[i][j]=0;
                    for(int k=0;k<row2;k++)
                    {
                        result[i][j]+=arr1[i][k]*arr2[k][j];
                    }

                }

            }
            System.out.println("Result");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }else {
            System.out.println("Cannot multiply");
        }



    }
}
