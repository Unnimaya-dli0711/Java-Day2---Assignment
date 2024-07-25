package StringPractice.com;

import java.util.Scanner;

public class Anagrams {
    public static void main(String [] args){
        System.out.println("Enter first String");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("Enter second String");
        String str2=sc.nextLine();
        boolean res=true;
        int flag=0;
        for(int i=0;i<str1.length();i++){
            flag=0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Not Anagram");
                res=false;
                break;
            }

        }

            System.out.println(res);
    }
}
