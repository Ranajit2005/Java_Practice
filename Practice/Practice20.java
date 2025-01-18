//Write a program in Java which will read a string and rewrite it in the alphabetical order. For example, the word STRING should be written as GINRST.

import java.util.Scanner;
import java.util.Arrays;

public class Practice20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the word : ");
        String str = sc.nextLine();

        char array[] = str.toCharArray();

        Arrays.sort(array);

        String sortString = new String(array);

        System.out.println(sortString);

        sc.close();
        
    }
}
