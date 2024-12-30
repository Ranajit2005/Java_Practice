//Interface after 1.9 version
    //-> We can have private method in interface after 1.9 version
    //-> We can have private static method in interface after 1.9 version
    //-> We can have private default method in interface after 1.9 version

//Example 1:

interface A{
    default void call(int a,int b){
        add(a,b);
    }

    private void add(int x,int y){

        System.out.println("The addition is : "+(x+y));
    }
}

class B implements A{

    // public void call(int x,int y){
    //     add(x,y); //It gives error because add method is private
    // }

    public void sub(int x,int y){
        System.out.println("Substraction is : "+(x-y));
    }
}

public class Test6 {
    public static void main(String[] args) {
        
        B b = new B();
        //b.add(10, 20);  //It gives error because add method is private

        b.call(10,15);
        b.sub(15, 5);
    }
}