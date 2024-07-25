package OperatorPrograms.com;

import java.util.Scanner;

public class BitwiseAndOrXor {
    public static  void  main(String[] args){
        System.out.println("Enter the two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a & b = "+(a&b));
        System.out.println("a | b = "+(a|b));
        System.out.println("a ^ b = "+(a^b));
    }
}
