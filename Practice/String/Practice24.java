//Reverse String

public class Practice24 {
    public static void main(String[] args) {

        String input = args[0];
        // System.out.println("Which portion want to reverse, give starting and ending index : ");
        int startIndex = Integer.parseInt(args[1]);
        int endIndex = Integer.parseInt(args[2]);
        
        String portionToReverse = input.substring(startIndex, endIndex);
        String reversedPortion = new StringBuilder(portionToReverse).reverse().toString();
        String result = input.substring(0, startIndex) + reversedPortion + input.substring(endIndex);

        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);     
    }
}
