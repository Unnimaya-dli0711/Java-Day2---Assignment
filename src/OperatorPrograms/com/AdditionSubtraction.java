package OperatorPrograms.com;

import java.util.Scanner;

public class AdditionSubtraction {
    public static  void  main(String[] args){
        System.out.println("Enter the two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        System.out.println("The Addition Result : "+add);
        System.out.println("The Subtraction Result : "+sub);
    }
}
