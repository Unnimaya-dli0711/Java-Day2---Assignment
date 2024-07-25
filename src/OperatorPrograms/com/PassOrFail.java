package OperatorPrograms.com;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){

        System.out.println("Enter a score");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        String str = "";
        str+=score>75 ? "Passed" : "Failed";
        System.out.println("Student "+str);
    }
}
