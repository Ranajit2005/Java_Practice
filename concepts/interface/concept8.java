// Nested interfaces are interfaces that are defined within another interface or class. They can be used to logically group related interfaces together and to provide a namespace for the nested interfaces.

interface OuterInterface {
    void outerMethod();

    interface NestedInterface {
        void innerMethod();
    }
}

class InnerClass implements OuterInterface.NestedInterface {
    @Override
    public void innerMethod() {
        System.out.println("Hello from nested method in nested interface");
    }
}

class OuterClass implements OuterInterface {
    @Override
    public void outerMethod() {
        System.out.println("Hello from outer method in outer interface");
    }
}


public class concept8 {

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.outerMethod();

        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();

        OuterInterface.NestedInterface nestedObj = new InnerClass();
        nestedObj.innerMethod();
    }
    
}