//Write your own method called deleteMe(String str, int m) that returns the input string with the m-th element removed.

import java.util.Scanner;

public class Practice22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the string : ");
        String str = sc.nextLine();

        System.out.print("Give the index : ");
        int a = sc.nextInt();

        System.out.println(deleteMe(str,a));

        sc.close();
        
    }

    public static String deleteMe(String str,int m){

        if(m<1 || str.length()<m){
            return "Invalid";
        }else{
            String s = str.substring(0,m-1) + str.substring(m);
            return s;
        }
    }

}
