// So, if default method is allowed in interface, then again we faced Diamond problem. But in this case, we can solve this problem by using super keyword. We can use super keyword to call the default method of interface.

// If we override the default method, then in derived class the method should declear as public


interface B{
    default void show(){      
        System.out.println("Hello from B show function");
    }
}

interface C{
    default void show(){
        System.out.println("Hello from C show function");
    }
}

class A implements B, C{
    @Override
    public void show(){ // another thing comes to mind that the function is public but it was actually default in previous interfaces. 
        // The reason is in interface, default warks as 'public default void show()' and we can not change the access modifier of default method in interface. So, it is public by default.
        
        B.super.show(); // this will call the show method of interface B
        C.super.show(); // this will call the show method of interface C
        System.out.println("Hello from A show function");   // this will call the show method of class A
        // So we do anything of them
    }
}



public class concept4 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}