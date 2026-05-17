

class Parent{
    // int a;
    int common = 10;
    int parentOnlyVar = 20;

    void commonMethod(){
        System.out.println("This is the common method of the parent class");
    }

    Parent(){
        System.out.println("Parent class constructor");
    }

    void parentOnly(){
        System.out.println("This method is only in the parent class");
    }
}

class Child extends Parent{
    int childOnlyVar = 30;
    int common = 40;

    void commonMethod(){
        System.out.println("This is the common method of the child class");
    }

    Child(){
        System.out.println("Child class constructor");
    }

    void childOnly(){
        System.out.println("This method is only in the child class");
    }

}



public class concept2 {
    public static void main(String[] args) {

        // Child c = new Base(); // This is not allowed because we cannot create an object of the parent class and assign it to a reference variable of the child class. This is because the parent class does not have all the properties and behaviors of the child class, so it cannot be treated as an object of the child class.

        Parent p = new Child(); // This is allowed because we can create an object of the child class and assign it to a reference variable of the parent class. This is because the child class has all the properties and behaviors of the parent class, so it can be treated as an object of the parent class.

        p.commonMethod();

        // p.childOnly(); // This is not allowed because the reference variable p is of type Base, and the childOnly() method is not defined in the Base class.

        p.parentOnly(); // This is allowed because the parentOnly() method is defined in the Base class, and the reference variable p is of type Base. However, since the actual object that p refers to is of type Child, it will call the display() method of the Child class, which will print "This is the display method of the child class". This is because of dynamic method dispatch, which allows Java to determine at runtime which method to call based on the actual type of the object that a reference variable refers to.


        System.out.println(p.common);   // This will print 10 because the reference variable p is of type Base, and the common variable is defined in the Base class. However, since the actual object that p refers to is of type Child, it will access the common variable of the Child class, which has a value of 40. This is because of dynamic method dispatch, which allows Java to determine at runtime which variable to access based on the actual type of the object that a reference variable refers to.

        System.out.println(p.parentOnlyVar);    // This will print 20 because the reference variable p is of type Base, and the parentOnlyVar variable is defined in the Base class. However, since the actual object that p refers to is of type Child, it will access the parentOnlyVar variable of the Child class, which has a value of 20. This is because of dynamic method dispatch, which allows Java to determine at runtime which variable to access based on the actual type of the object that a reference variable refers to.

        // System.out.println(p.childOnlyVar); // This is not allowed because the reference variable b is of type Base, and the childOnlyVar variable is not defined in the Base class.

        // Downcasting 

        Child c = (Child) p; // This is allowed because the actual object that p refers to is of type Child, so we can downcast it to a reference variable of type Child. However, if the actual object that p refers to was not of type Child, this would throw a ClassCastException at runtime.

        // Now we can access the childOnly() method and the childOnlyVar variable using the reference variable c, which is of type Child.
        c.childOnly();
        System.out.println(c.childOnlyVar);
    }
}
