// In java, multiple inheritance is not supported through classes, but it can be achieved using interfaces.
// class A extends B, C{ } // this is not allowed, but class A implements B, C{ } // this is allowed

interface B{
    void showB();
    void commonShow();
}

interface C{
    void showC();
    void commonShow();
}

class A implements B, C{
    @Override
    public void showB(){
        System.out.println("Hello from B show function");
    }

    @Override
    public void showC(){
        System.out.println("Hello from C show function");
    }

    @Override
    public void commonShow(){
        System.out.println("Hello from common show function");
    }
}

// multiple class implemtnts same interface

class D implements B{
    @Override
    public void showB(){
        System.out.println("Hello from B show function");
    }

    @Override
    public void commonShow(){
        System.out.println("Hello from common show function");
    }
}

// If a class don't implement all the methods of interface, then it must be declared as abstract class or interface. If we use abstract class, then we have to use implements key word and if we use interface, then we have to use extends key word. 
// In both cases, we can not create object of abstract class or interface because they are incomplete class.

abstract class E implements B{
    @Override
    public void showB(){
        System.out.println("Hello from B show function");
    }
}

interface F extends B{
    
}


public class concept2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.commonShow();

        D obj2 = new D();
        obj2.commonShow();

    }
}
