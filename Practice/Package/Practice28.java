//1. Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/ inherited block).
// 2. Show that static block is executed at the time of class loading and also the order of execution of these blocks (for multiple blocks/ inherited block) 



public class Practice28 {

    Practice28(){
        System.out.println("Hellow from constactor");
    }

    static{
        System.out.println("Hellow from static");
    }

    {
        System.out.println("Hellow from instance block");
    }

    public static void main(String[] args) {

        Practice28 a = new Practice28();
        
    }
    
}
