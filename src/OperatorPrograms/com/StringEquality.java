package OperatorPrograms.com;

import java.util.Objects;
import java.util.Scanner;

public class StringEquality {
    public static void main(String [] args){
        String str1;
        String str2;
        System.out.println("Enter two strings");
        Scanner sc =new Scanner(System.in);
        str1=sc.nextLine();
        str2=sc.nextLine();
        if(str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
