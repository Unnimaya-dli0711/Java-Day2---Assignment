package OperatorPrograms.com;

import java.util.Scanner;

public class MutiplicationTable {
    public static void main(String [] args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The multiplication table for : "+num);
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+num+" = "+i*num);
        }
    }
}
