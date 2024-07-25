package OperatorPrograms.com;

import java.util.Scanner;

public class Assignmentoperator {
    public static void main(String[] args){

        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.print(num+" + 2 = ");
        num+=2;
        System.out.println(num);

        System.out.print(num+" - 1 = ");
        num-=1;
        System.out.println(num);

        System.out.print(num+" * 5 = ");
        num*=5;
        System.out.println(num);

        System.out.print(num+" / 2 = ");
        num/=2;
        System.out.println(num);

        System.out.print(num+" % 3 = ");
        num%=3;
        System.out.println(num);
    }
}
