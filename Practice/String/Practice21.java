//Write a program in Java to extract a portion of a character string and print the extracted string. Assume that m characters are extracted, starting with the n-th character

import java.util.Scanner;

public class Practice21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print("Give the index : ");
        int a = sc.nextInt();

        System.out.print("How many charecter : ");
        int b = sc.nextInt();

        if(a<1 || a+b-1>str.length()){
            System.out.println("Invalid");
        }else{
            String s = str.substring(a-1, b);
            System.out.println(s);
        }

        sc.close();
        
    }
}