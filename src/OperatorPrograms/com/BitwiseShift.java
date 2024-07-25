package OperatorPrograms.com;

import java.util.Scanner;

public class BitwiseShift {
    public static  void  main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("Left shifting the number (a << 2 )= "+(a<<2));
        System.out.println("Right shifting the number (a >> 2 )= "+(a>>2));
    }
}
