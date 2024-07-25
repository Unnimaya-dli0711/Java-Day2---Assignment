package OperatorPrograms.com;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args){

        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Number Before and After pre-incrementing : "+ num +" - "+num++);
        System.out.println("Now number is : "+num);
        System.out.println("Number Before and After post-incrementing : "+ num +" - "+(++num));
        System.out.println("Now number is : "+num);
        System.out.println("Number Before and After pre-decrementing : "+ num +" - "+num--);
        System.out.println("Now number is : "+num);
        System.out.println("Number Before and After post-decrementing : "+ num +" - "+(--num));
        System.out.println("Now number is : "+num);
    }
}
