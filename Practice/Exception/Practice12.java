//Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a trycatch clause to catch the exception
//Write a program to fire any checked exception manually using ‘throw’ keyword.


public class Practice12 {

    public void CheckedException() throws Exception {
        
    }
    public static void main(String[] args) {

        String str = "null";

        try {

            System.out.println(str.length());
            
        } catch (NullPointerException e) {
            
            System.out.println("Null pointer Exception");
        }

        try {
            
            // throw new CheckedException();

        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
