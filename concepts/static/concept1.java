class A{
    void fun1(){    // non static function(instance member function)
        System.out.println("Hello from A fun 1 non static function(instance member function)");
    }

    void fun2(){
        System.out.println("Hello from A fun 2 non static function(instance member function)");
    }
}

class B{
    static void fun1(){     // static function(class member function)
        System.out.println("Hello from B fun 1 static function");
    }

    static void fun2(){
        System.out.println("Hello from B fun 2 static function");
    }
}

class concept1{
    public static void main(String[] args) {

        // A.fun1();   // we can not call non static function without creating object of class
        // A.fun2();

        B.fun1();   // we can call static function without creating object of class
        B.fun2();

        A a = new A();
        a.fun1();   // we can not call non static function without creating object of class
        a.fun2();

    }
}