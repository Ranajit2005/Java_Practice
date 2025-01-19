//Show that the String object is immutable but StringBuffer type object is mutable.

public class Practice19 {
    public static void main(String[] args) {
        
        String str = "Hello";
        str.concat(" World");
        System.out.println(str); 

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); 

    }
}
