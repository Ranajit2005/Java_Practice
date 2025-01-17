

public class Practice11 {
    public static void main(String[] args){

        System.out.println("Start the code");

        try {
            int arr[] = {1,2,3};
            System.out.println(arr[0]);
            
            int a = 10/0;
            System.out.println("The value of a is : "+a);


        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array of bound");

        } catch(ArithmeticException e){

            System.out.println("Arithmatic exception");

        }

        System.out.println("End of the programme");

    }
}
