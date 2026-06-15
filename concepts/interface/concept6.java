// Interface cannot have constructor because we cannot create object of interface. Interface is a blueprint of class.

// Interface can have private and private static methods, but we cannot call them outside. We can call them onlt inside the interface.

interface A{
    // A(){
    //     // we can not create constructor in interface because we cannot create object of interface. Interface is a blueprint of class.
    // }

    private void privateMethod(){
        System.out.println("Hello from private method in interface");
    }

    private static void privateStaticMethod(){
        System.out.println("Hello from private static method in interface");
    }

    default void usePrivateMethod(){
        A.privateStaticMethod(); // we can call private static method inside the interface
        privateStaticMethod();
        // So here A.privateStaticMethod() and privateStaticMethod() both are same because we are calling private static method inside the interface.
        privateMethod(); // we can call private method inside the interface
    }
    
}

class B implements A{

}


public class concept6 {

    public static void main(String[] args) {
        B obj = new B();
        obj.usePrivateMethod(); // we can call default method in interface using object of class which implements the interface
    }
    
}