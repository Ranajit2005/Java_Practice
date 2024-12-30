//Abstract class
    //-> Abstract is a keyword in java used to create abstract class and method
    //-> Abstract class can have abstract and non-abstract method
    //-> Abstract class can't be instantiated, means no object of abstract class can be created
    //-> Abstract class can have constructor and static method
    //-> Abstract class can have main() method
    //-> Abstract class can have final method
    //-> Abstract class can have data member


//Abstract method
    //-> Abstract method is a method that is declared but not implemented
    //-> Abstract method can only be present in abstract class
    //-> Abstract method can't be private
    //-> Abstract method can't be final
    //-> Abstract method can't be static
    //-> Abstract method can't be synchronized
    //-> Abstract method can't be native


//     -> Example 1 <-
abstract class Animal{      //If we use abstarct method in class, then class should be abstract

    /*Animal(){       //Abstract class can have constructor and it is automatically called when object of child class is created
        System.out.println("Animal class constructor");
    }*/

    //void show(); //Now it gives error
    abstract void show(); //Now it is correct

}

class Dog extends Animal{

    /*Dog(){
        //super();    //It has no meaning because parent class constructor is called automatically
        System.out.println("Dog class constructor");
    }*/

    void show(){
        System.out.println("Dog");
    }
}

//     -> Example 2 <-

abstract class programming{
    //We definf 2 abstract program

    abstract void Coding();
    abstract void Debugging();

} 

abstract class Coder extends programming{

    void Coding(){
        System.out.println("witre Coding");
    }

    //Now only know about Coding method. But it is extends form programming class so it should have Debugging method also. So we just write the method as abstract and leave it blank. For this reason the class also be abstrack

    //abstract void Debugging();    //If we do not write it, then it gives no error. But class should be abstract

}

class Degbugger extends Coder{

    void Debugging(){
        //super.Debugging();   //It is not necessary to call super class method
        System.out.println("Debugging");
    }

}



public class Test3 {
    public static void main(String[] args) {
        //Animal a = new Animal();     //Can't create object of abstract class
        // Dog d = new Dog();
        // d.show();

        Degbugger d = new Degbugger();
        d.Debugging();
        //Coder c = new Coder(); //It is not possible beacuse Coder is abstract class

        Coder c = new Degbugger();
        c.Coding();
        c.Debugging();
    }
}
