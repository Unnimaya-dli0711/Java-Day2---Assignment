package Arrays.com;

import java.util.Scanner;

public class Frequency {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int freq=0;
        System.out.println("Enter the number whose frequency should be found ");
        int key=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==key)
                freq++;
        }
        System.out.println("The frequency : "+freq);
    }
}
