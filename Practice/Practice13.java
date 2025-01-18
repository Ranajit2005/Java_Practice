// Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a per - son is less than Rs. 10,000 /-) and fire the exception

import java.util.Scanner;

class PayOutOfBoundException extends Exception{

    PayOutOfBoundException(String msg){
        System.out.println(msg);
    }

}

public class Practice13{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Give ammout : ");
        double salary = sc.nextDouble();

        try {
            
            if (salary < 10000) {
                throw new PayOutOfBoundException("Salary is below the minimum limit of Rs. 10,000/-");
            } else {
                System.out.println("Salary is within acceptable limits.");
            }
        } catch (PayOutOfBoundException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }       
        
    }

    // public static void sal(int sallary) throws PayOutOfBoundException {

    //     if(sallary>= 1000){
    //         throw new PayOutOfBoundException("You cross your limit");
    //     }else{
    //         System.out.println("Correct ");
    //     }

    // }

}
