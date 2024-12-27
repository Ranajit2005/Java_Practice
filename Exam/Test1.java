
import java.util.*;
//Polymorphism is a concept of OOPs in which a single object can be used in different ways.
//Polymorphism is two type
//   i) Compile time and ii) Run time 

// Compile Time Polymorphism -> Method Overloading

class Add{
    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(int a,int b,int c){        //Basis of number of parameter
        System.out.println(a+b+c);
    }

    void add(int a,double b){       //Basis of data type 
        System.out.println(a+b);
    }

    void add(double a,int b){       //Basis of order of parameter
        System.out.println(a+b);
    }
}


//Runtime Polymorphisom

class A{
    void show(){
        System.out.println("I am in class A");
    }
}

class B extends A{
    //@Override   //If we use @Override, then this method shoulf present in parent class
    void show(){
        super.show();       //Using it we can call parent class method which is override in child class
        System.out.println("I am in class B");
    }
}


public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        A c = new B();
        // b.show();
        c.show();
    }
}
