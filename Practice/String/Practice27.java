//Write a program to take a sentence and convert it into string arrays and sort the words using any Sorting technique.

import java.util.Scanner;

public class Practice27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Give the sentence : ");
        String s = sc.nextLine();

        String ch[] = s.split(" ");

        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if(ch[i].length()<ch[j].length()){
                    
                    String temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        for(int i =0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

        sc.close();
        
    }
}
