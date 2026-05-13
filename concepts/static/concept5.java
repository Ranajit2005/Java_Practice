

public class concept5 {     // This is work as an outer class

    static class InnerClass{
        String name;
        void display(){
            System.out.println("The name is: " + name);
        }


        InnerClass(String name) {
            this.name = name;
        }
    }

    

    public static void main(String[] args) {
        
        InnerClass I1 = new InnerClass("Alice");
        InnerClass I2 = new InnerClass("Bob");


        I1.display();  // Output: The name is: Alice
        I2.display();  // Output: The name is: Bob

    }
}
