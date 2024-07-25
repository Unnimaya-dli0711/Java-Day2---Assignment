package Logical.com;

import java.util.Scanner;

public class StopWatch {
    public static  void  main(String[] args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long start=System.currentTimeMillis();
        System.out.println("Enter another number");
        int b=sc.nextInt();
        long end=System.currentTimeMillis();
        System.out.println("Time change : "+(end-start));
    }
}
