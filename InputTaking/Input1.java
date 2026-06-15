import java.util.*;

// Size of the array is given and those are space separated
/*
input -> 
5
1 2 3 4 5
*/


public class Input1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0;i < size; i++){
            arr[i] = sc.nextInt();  // If those are integer
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }

}
