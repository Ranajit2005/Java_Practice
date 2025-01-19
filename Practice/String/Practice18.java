//Generate password from initials of one’s first_name, middle_name, last_name and with last four digit of your roll_no.(if middle name not presents ,it won't come)

import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter your middle name: ");
        String middleName = sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Enter your roll number (must be greater than 4 numbers) : ");
        String rollNumber = sc.nextLine();

        StringBuilder password = new StringBuilder();

        password.append(firstName.charAt(0));
        password.append(middleName.charAt(0));
        password.append(lastName.charAt(0));
        password.append(rollNumber.substring(rollNumber.length() - 4));

        System.out.println("Your password is: " + password);
        
    }
}