// In java, only abstract methos is allowed in interface. But after java 8, we can also use default and static methods in interface. 
// Default methods are used to provide default implementation of method in interface. 
// Static methods are used to provide static implementation of method in interface. We can not override static methods in interface.


interface A{
    void show(); // this is public abstract method by default

    default void defaultShow(){
        System.out.println("Hello from default show function");
    }

    static void staticShow(){
        System.out.println("Hello from static show function");
    }
}

class B implements A{
    @Override
    public void show(){
        System.out.println("Hello from B show function");
    }
}

public class concept3 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.defaultShow();
        A.staticShow();
    }
}