

class Base{

    int a;

    

    Base(){

        // Note 

        super(); // This is the default constructor of the Object class, which is the parent class of all classes in Java. It is called automatically when we create an object of the child class, and it initializes the properties of the parent class before the child class can initialize its own properties.
        System.out.println("Base class constructor");
    }
    Base(int a){
        this.a = a;
    }
}


class Child extends Base{

    int b;

    Child(){

        // Note

        //Internally it will call the super class constructor automatically, means it runs super();
        System.out.println("Child class constructor");
    }

    Child(int a){
        this.a = a;
        System.out.println("The value of a is set");

        // Note

        // super(); // Now this raised an error because we cannot call super() after we have used this.a = a; because super means parent class constructor and it has no idea about what child class is doing, so it should be the first statement in the constructor of the child class.
    }
}

class concpet1 {
    public static void main(String[] args) {
        
        Child c = new Child();


        // o/p will be :-
        // Base class constructor
        // Child class constructor
        // because when we create an object of the child class, it will first call the constructor of the parent class and then it will call the constructor of the child class. This is because the child class inherits the properties and behaviors of the parent class, and it needs to initialize those properties before it can initialize its own properties.

    }
}
