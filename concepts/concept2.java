class A{
    int a, b, c = 5;

    int add(){
        return (a + b + c);
    }
}


class concept2 {
    public static void main(String[] args) {
        A a1 = new A();

        System.out.println("Addition first time : "+a1.add());

        a1.b = 10;
        
        System.out.println("a = " + a1.a);   // default value of int is 0
        System.out.println("b = " + a1.b);
        System.out.println("c = " + a1.c);

        System.out.println("Addition second time : "+a1.add());

    }    
}