package Logical.com;

import java.util.Scanner;

public class Perfect {
    public static  void  main(String[] args){
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int flag=0;
    int res=0;
    for(int i=1;i<a;i++){
        if(a%i==0){
             res+=i;
        }
    }
    boolean pr=res==a?true:false;
    System.out.println(pr);
}
}
