package Logical.com;

import java.util.Scanner;

public class Reverse {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= sc.nextInt();
        int reverse=0;
        int n=number;

        while(number>0)
        {
            int rem=number%10;
            reverse=reverse*10+rem;

            number=number/10;
        }
        System.out.println("Reverse of the number:"+reverse);
    }
}
