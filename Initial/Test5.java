// Interface after 1.8 version
    //-> After 1.8 version, we can define method in interface by using default keyword and static keyword
    //-> We can also define main method in interface
    //-> We can also define static method in interface
    //-> We can also define default method in interface
    //-> We can also override the default method in class which implements the interface
    //-> We can't override the static method in class which implements the interface
    //-> We can't define constructor in interface

// Example 1 ->
// Interface default method

interface A{
    void a1();
    void a2();  
    default void a3(){      //using default keyword, we define method in interface class
        System.out.println("form a3");
    }

}

class B implements A{
    public void a1(){
        System.out.println("from a1");
    }

    public void a2(){
        System.out.println("from a2");
    }

    //We can also override this default method, it giver us no error
    // @Override   //It gives no error
    // public void a3(){
    //     System.out.println("Override method a3");
    // }

}

//Example 2 ->
//Interface static method

interface C{

    void c1();
    static void c2(){      //using static keyword, we define method in interface class
        System.out.println("from c3");
    }

    //The main defarence is in static and defaut method in interface is that, in using default we can override the method but using static we cannot override the method
}

class D implements C{

    public void c1(){
        System.out.println("form c1 in class D");
    }

    //@Override   //Now it gives error
    // public void c2(){
    //     System.out.println("form c2 in class D");
    // }
}

//Example 3 ->
// Main method can write in interface

// interface Test5{
//     public static void main(String[] args) {
//         System.out.println("Run with no error");
//     }
// }



public class Test5 {
    public static void main(String[] args) {

        // A a = new B();
        // a.a1();
        // a.a2();
        // a.a3();

        // C.c2();  //It gives no error
        D d = new D();
        d.c1();
        //d.c2(); //It gives error because we can't override the static method in class which implements the interface
    }
    
}
