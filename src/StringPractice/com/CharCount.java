package StringPractice.com;

import java.util.Scanner;

public class CharCount {
    public static void main(String [] args){
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int freq=0;
        for(int i=0;i<str.length();i++){
            freq=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    freq++;
                }
            }
            System.out.println(str.charAt(i)+" : "+freq);
        }
    }
}
