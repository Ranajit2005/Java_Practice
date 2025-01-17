// Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. In main (), create an object of derived class and call the methods. [do all without package statement]



// First interface
interface Interface1 {
    void method1();
    void method2();
}

// Second interface
interface Interface2 {
    void method3();
    void method4();
}

// New interface inheriting from both Interface1 and Interface2
interface CombinedInterface extends Interface1, Interface2 {
    void method5();
}

// Concrete class
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("Method from ConcreteClass.");
    }
}

// Class implementing CombinedInterface and inheriting from ConcreteClass
class DerivedClass extends ConcreteClass implements CombinedInterface {

    public void method1() {
        System.out.println("Implementation of method1 from Interface1.");
    }

    public void method2() {
        System.out.println("Implementation of method2 from Interface1.");
    }

    public void method3() {
        System.out.println("Implementation of method3 from Interface2.");
    }

    public void method4() {
        System.out.println("Implementation of method4 from Interface2.");
    }

    public void method5() {
        System.out.println("Implementation of method5 from CombinedInterface.");
    }
}

// Main class
public class Practice5{
    public static void main(String[] args) {
        // Create an object of DerivedClass
        DerivedClass obj = new DerivedClass();

        // Call methods from the implemented interfaces
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();

        // Call method from the concrete class
        obj.concreteMethod();
    }
}