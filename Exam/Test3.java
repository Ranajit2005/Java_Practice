//abstract class
    //-> abstract is a keyword in java used to create abstract class and method
    //-> Abstract class can have abstract and non-abstract method
    //-> Abstract class can't be instantiated, means no object of abstract class can be created
    //-> Abstract class can have constructor and static method
    //-> Abstract class can have main() method
    //-> Abstract class can have final method
    //-> Abstract class can have data member


//abstract method
    //-> Abstract method is a method that is declared but not implemented
    //-> Abstract method can only be present in abstract class
    //-> Abstract method can't be private
    //-> Abstract method can't be final
    //-> Abstract method can't be static
    //-> Abstract method can't be synchronized
    //-> Abstract method can't be native



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


public class Test3 {
    public static void main(String[] args) {
        //Animal a = new Animal();     //Can't create object of abstract class
        Dog d = new Dog();
        d.show();
    }
}
