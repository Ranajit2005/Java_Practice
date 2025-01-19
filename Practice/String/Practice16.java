//Find length of a string taken from keyboard and also find the length of that string except front and end spaces.

import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Give the input string : ");
        String str = sc.nextLine();
        int firstString = str.length();

        String str2 = str.trim();
        int secondString = str2.length();

        System.out.println("First String is "+str+" and its length : "+ firstString);
        System.out.println("Sceond String is "+str2+" and its length : "+ secondString);


        sc.close();
        
    }
}
