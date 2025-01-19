
public class Practice11 {
    public static void main(String[] args){

        System.out.println("Start the code");

        try {

            //ArrayIndexOutOfBoundsException
            int a = 10/5;
            System.out.println("The value of a is : "+a);

            //ArithmeticException
            int arr[] = {1,2,3};
            System.out.println(arr[0]);

            //StringIndexOutOfBoundsException
            String s = "Hey there,what's up";
            System.out.println(s);

            char ch = s.charAt(9);
            System.out.println(ch);

            //NegativeArraySize exception
            int size = -5;
            int[] brr = new int[size];
            System.out.println(brr);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array of bound");

        } catch(ArithmeticException e){

            System.out.println("Arithmatic exception");

        }catch(StringIndexOutOfBoundsException e){

            System.out.println("String Index Out Of Bounds exception");

        }catch(NegativeArraySizeException e){

            System.out.println("Negative Array Size exception");
            
        }

        System.out.println("End of the programme");

    }
}
