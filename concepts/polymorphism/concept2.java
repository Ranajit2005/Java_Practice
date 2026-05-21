// Method Overriding
class Parent{
    void show(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    @Override   // This annotation is used to indicate that the method is overriding a method from the parent class. It is not mandatory, but it is a good practice to use it, beacause there may be a lot of methods in the parent class and we may forget which method we are overriding. So it is better to use the annotation @Override to avoid such errors.
    void show(){
        System.out.println("This is child class");
    }

    // @Override        // So if we use the annotation @Override and the method does not override a method from the parent class, then it will give an error. It is a good practice to use the annotation @Override to avoid such errors. 
    // void display(){ // The method display() of type Child must override or implement a supertype 
    //     System.out.println("This is child class");
    // }

}


class concept2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();   // This is parent class

        Child c = new Child();
        c.show();   // This is child class

        Parent pc = new Child();  // This is called upcasting. It is the process of converting a child class object to a parent class object. It is done automatically by the compiler. It is also called implicit casting. It is used to achieve runtime polymorphism.
        pc.show();  // This is child class
        
    }    
}
