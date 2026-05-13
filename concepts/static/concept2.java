
class A{
    static int a = 5;
    static void fun1(){
        System.out.println(""+ "Hello from A fun 1 static function");
    }
}


class B extends A{
    int b = 10;
    static int a = 10;  // So, we can say static variable can be overridden but it is not recommended because it can create confusion, so we should avoid overriding static variable. So, we should avoid hiding static variable. So, we should avoid hiding static variable because it can create confusion. So, we should avoid hiding static variable.
    static void fun1(){     // So, we can say static function can be overridden but it is not recommended because it can create confusion, so we should avoid overriding static function. So, we should avoid hiding static function. So, we should avoid hiding static function because it can create confusion. So, we should avoid hiding static function.
        System.out.println(""+ "Hello from B fun 1 static function"); 
    }


    static void check1(){
        System.out.println("Hello from concept2 check1 static function");
        // check2();  // We cannot call non static function in static function because non static function is belong to object and static function is belong to class, so we can call non static function in static function because we know which object we want to call.

        // main method also static function, so we can not call non static function in main method 

        B b1 = new B();
        b1.check2();  // We can call non static function in static function by creating object of class because non static function is belong to object and static function is belong to class, so we can call non static function in static function by creating object of class because we know which object we want to call.
        System.out.println(b1.b);

    }

    void check2(){
        System.out.println("Hello from concept2 check2 non static function");
        check1();  // We can call static function in non static function because static function is belong to class and non static function is belong to object, so we can call static function in non static function because we know which object we want to call.
        System.out.println(a+" "+b);
    }
}

class concept2 {
    public static void main(String[] args) {
        System.out.println(A.a);
        A.fun1();
        System.out.println(B.a);
        B.fun1();
    }
}
