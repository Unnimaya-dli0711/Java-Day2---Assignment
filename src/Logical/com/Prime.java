package Logical.com;

import java.util.Scanner;

public class Prime {
    public static  void  main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int flag=0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                flag=1;
                break;
            }
        }
        boolean res=flag==0?true:false;
        System.out.println(res);
    }
}
