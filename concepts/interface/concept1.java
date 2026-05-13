interface A{
    int a = 5;   // by default it is static and final
    static void fun(){
        System.out.println("Hello from A fun static function in interface");
    }
}

interface B extends A{
    int a = 10;
    static void fun(){  // we can not override static function in interface
        System.out.println("Hello from B fun static function in interface");
    }
}

class C implements B{
    // we can not override static function in interface
    // int a = 15; // non-static variable a cannot be referenced from a static context


    public void fun(){      // if we want to override fun() function in class C then we have to make it non static function because we can not override static function in interface. If we don't write fun() function in class C then it will give error because we can not call static function in interface without using interface name.
        System.out.println("Hello from C fun non static function in class");
    }
}


class concept1{
    public static void main(String[] args) {
        A.fun();
        B.fun();
        C c = new C();
        c.fun();
        System.out.println(C.a);
        // System.out.println(B.a);
    }
}