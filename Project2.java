import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // System.out.println(n);

        System.out.print("Give a valid number : ");
        int name = input.nextInt();
        switch (name) {
            case 1:
                System.out.println("Now you are in case 1");
                break;
            case 2:
                System.out.println("Now you aur in case 2");
                break;
            case 3:
                System.out.println("Now you are in case 3");
                break;
            default:
                System.out.println("Now you are in default case");
        }
    }
}
