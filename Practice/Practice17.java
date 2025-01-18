//Check if "Tech" presents in "University of Technology" or not. If yes return its position.

public class Practice17 {
    public static void main(String[] args) {

        String str = "University of Technology";
        String s = "Tech";

        int pos = str.indexOf(s);

        if(pos==-1){
            System.out.println("Not found");
        }else{
            System.out.println("The position is : "+ pos);
        }
        
    }
}
