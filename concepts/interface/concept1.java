// Interface is a blueprint of a class. It has static constants and abstract methods. It is used to achieve abstraction and multiple inheritance in Java. It is also used to provide a contract for the classes that implement it.

// By default in interface, all methods are public abstract
// By default in interface, all variables are public static final
// We can not create object of interface because interface is incomplete class
// Derived class must implement all the methods of interface otherwise it will give error
// Interface reference type is allowed


interface A{
    int a = 10; // this is public static final variable by default
    void show(); // this is public abstract method by default
}

class B implements A{
    @Override
    public void show(){
        System.out.println("Hello from B show function");
    }
}




public class concept1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        // A obj2 = new A(); // we can not create object of interface because interface is incomplete class

    }
}
