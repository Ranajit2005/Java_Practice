
class Base{

    int a;

    Base(){
        System.out.println("Base class constructor");
    }
    Base(int a){
        this.a = a;
    }
}


class Child extends Base{
    Child(){
        // Internally it will call the super class constructor automatically, means it runs super();
        System.out.println("Child class constructor");
    }
}

class concpet1 {
    public static void main(String[] args) {
        
        Child c = new Child();


    }
}
