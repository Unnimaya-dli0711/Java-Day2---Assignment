package Arrays.com;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int even=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
                even++;
        }
        System.out.println("The number of even elements are : "+even);
        System.out.println("The number of odd elements are : "+(n-even));
    }
}
