class Test{
    static {    // This static block will be executed when the class is loaded into memory, which happens when we create an instance of the class or access any static member of the class.
        System.out.println("Hello from Test static block");
    }


    static void display() {
        System.out.println("Hello from Test static method");
    }
}


public class concept4 {

    static {
        System.out.println("Hello from concept4 static block");
    }

    public static void main(String[] args) {
        Test t = new Test();    
        Test.display();

    }
}
