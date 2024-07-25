package StringPractice.com;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String [] args){
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length()/2;i++){
            if(  str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("False");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("True");
    }
}
