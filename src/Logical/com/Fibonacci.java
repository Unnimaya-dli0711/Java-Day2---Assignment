package Logical.com;

import java.util.Scanner;

public class Fibonacci {
    public static  void  main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int  n1=0,n2=1;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<a;i++){
             int n3=n1+n2;
             n1=n2;
             n2=n3;
            System.out.print(n3+" ");
        }

    }
}
