//Write a program to demonstrate anonymous inner class (using super class and interface)

class Super{

    public void display(){
        System.out.println("This is Super class display method");
    }
}

interface Interface{

    void show();
}

public class Practice6 {
    public static void main(String[] args) {

        Super s = new Super(){
            public void display(){
                System.out.println("This is Super class");
            }
        };

        s.display();

        Interface i = new Interface(){
            public void show(){
                System.out.println("This is Interface");
            }
        };

        i.show();
        
    }
}
