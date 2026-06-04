// Static method cannot be overriden

class Parent{
    static void show(){
        System.out.println("This is parent class");
    }

    static void display(){
        System.out.println("This is parent class");
    }


}

class Child extends Parent{

    // @Override    // So we cannot override a static method from the parent class, because static methods are not associated with any object, they are associated with the class.
    // void show(){}   // This instance method cannot override the static method from Parent
    
    // @Override    // Using static, we also cannot override static method
    static void display(){
        System.out.println("This is child class");
    }

}



class concept3{
    public static void main(String[] args) {

        Child c = new Child();
        c.show();   // So, child cannot override static method, but child inherites it 


        Parent a = new Child();
        a.show();   // Here also child can inherites

        c.display();    // So, static method can be hidden but cannot be overridden. So it will call the display() method of Child class, because c is a reference of Child class. So it will print "This is child class". This is called method hiding, because the static method display() of Child class hides the static method display() of Parent class.

        a.display();    // It depends on the reference type, so it will call the display() method of Parent class, because a is a reference of Parent class. So it will print "This is parent class". This is called method hiding, because the static method display() of Child class hides the static method display() of Parent class.

        Parent.display();   // Perfect way to use it, because static method is associated with the class, so we should call it using the class name.
        Child.display();    // Perfect way to use it, because static method is associated with the class, so we should call it using the class name.

        // So when we deals with static, it always depends on the reference type, not it's constractor.


    }
}