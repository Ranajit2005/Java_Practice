//Take a sting from keyboard and convert into character array (new one).

public class Practice14 {
    public static void main(String[] args) {

        String str = "hellow how are you";
        // char[] arr = new char[str.length()];
        
        char arr[] = str.toCharArray();

        for (int index = 0; index < str.length(); index++) {
            System.out.println(arr[index]);
        }
        
    }
}
