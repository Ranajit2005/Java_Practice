//Interface 

    //-> Interface is a collection of abstract methods.
    //-> A class implements an interface, thereby inheriting the abstract methods of the interface.
    //-> Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.
    //-> Interface method are by default abstract and public
    //-> Interface can't have instance variables because they are public static final by default
    //-> Interface can't have constructor because it is not a class
    //-> Interface method must be override in the class which implements it


//Example 1:

interface Client{

    int a = 100; //By default it is public static final
    void value();   //By default it is public and abstract
    void show();    //By default it is public and abstract
    
}

class Dev implements Client{
    // String str;
    public void value(){
        System.out.println("the value of a is "+a);
        //super.a = 200;  //It gives error because a is final
    }
    
    

    public void show(){ //It is necessary to override the method of interface and it should be public because interface method are by default public
        System.out.println("Show method");
    }
}


//Example 2:

interface Animal{
    void sleep();   //public and abstract
    void eat(); //public and abstract

    //It gives error because interface method are by default abstract and public. So we can't define code here
    // void run(){
    //     System.out.println("Animal is running");
    // }   

}

abstract class Dog implements Animal{

    //Here we have to override one method
    public void eat(){
        System.out.println("Dog is eating");
    }

    //public abstract void sleep(); //There is no nessary to write it
}

class Puppy extends Dog{

    public void sleep(){
        System.out.println("Puppy is sleeping");
    }
}

//Example 3:
//Multiple inheritance

interface A{
    void show();
    void showA();
}

interface B{
    void show();
    void showB();
}

class C implements A,B{
    public void show(){     //Same method in A and B, but it does not gives any error
        System.out.println("Show method");
    }

    public void showA(){
        System.out.println("ShowA method");
    }

    public void showB(){
        System.out.println("ShowB method");
    }
}



public class Test4 {
    public static void main(String[] args) {
        Dev d = new Dev();
        d.value();
        d.show();

        Client c = new Dev();   //We can create reference of interface and object of class which implements it
        c.value();
        c.show();

        System.out.println(Client.a);   //We can access the variable of interface by using interface name beacuse it is public static final
    }
    
}