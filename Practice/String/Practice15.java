//Take a string from keyboard and a char array (of length 5). Now append the string to that char array.

import java.util.Scanner;


public class Practice15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        char ch[] = new char[5];
        for(int i =0;i<5;i++){
            System.out.print("Give the eliment " + (i+1) + "th : ");
            ch[i] = sc.next().charAt(0);
        }

        System.out.println("Give the string : ");
        sc.nextLine();
        String str = sc.nextLine();

        String s = new String(ch) + str ;

        System.out.println(s);

        sc.close();
        
    }
}
