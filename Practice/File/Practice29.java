//Write a program to read words from a text input file and print them over console.

import java.io.*;
import java.util.Scanner;

public class Practice29 {
    public static void main(String[] args) {
        
        String path = "C:\\Users\\RANAJIT\\OneDrive\\Desktop\\Code\\Java\\input.txt";

        File fp = new File(path);
        
        try {
            Scanner sc = new Scanner(fp);
            while(sc.hasNext()){
    
                String s = sc.next();
                System.out.println(s);
    
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }    
}
