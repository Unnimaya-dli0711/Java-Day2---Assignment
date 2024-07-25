package OperatorPrograms.com;

import java.util.Scanner;

public class Divisibilitycheck {
    public static void main(String [] args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0 && num%7==0)
            System.out.println("The number is divisible by both 5 and 7");
        else
            System.out.println("The number is not divisible by 5 and 7");
    }
}
