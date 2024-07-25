package Arrays.com;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;
        float avg=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=(float)sum/n;
        System.out.println("The sum is : "+sum);
        System.out.println("The Average is : "+avg);

    }
}
