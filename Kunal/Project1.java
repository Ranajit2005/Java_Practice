import java.util.Scanner;

public class Project1 {
    public static void main(String[] arg) {
 
        float b = 1.372f;
        char c = 'R';
        long d = 91239812389L;
        boolean e = true;
        byte f= 93;
        double h = 9817238712.7;
        String friut = "Mango";

        // int input;
        Scanner input = new Scanner(System.in);
        System.out.print("Give the veriable value : ");


        int a = input.nextInt();     //Take an intiger input
        String name = input.next();
        System.out.println("Hellow World " + a + b + c + d + e + f + h + friut + name);


        System.out.println(input.next());   //Input only a word as a String


        System.out.println(input.nextLine());   //Input a sentence as a String
    }
}