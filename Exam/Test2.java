// Encapsulation
    //-> Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
    //-> In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
    //-> This is also known as data hiding.
    //-> To achieve encapsulation in Java −
    //  1. Declare the variables of a class as private.
    //  2. Provide public setter and getter methods to modify and view the variables values.
    //-> Example:


class A{
    private int a;
    private String b;

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return a;
    }

    public void setB(String b){
        this.b = b;
    }

    public String getB(){
        return b;
    }
}

public class Test2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.setA(10);
        obj.setB("Hello");
        System.out.println(obj.getA());
        System.out.println(obj.getB());
    }
}
