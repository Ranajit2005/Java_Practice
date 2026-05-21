// Polymorphism: Poly means many, morphism means forms. It is the ability of an object to take on many forms. It allows us to perform a single action in different ways.
// Types of Polymorphism:
// 1. Compile-time Polymorphism (Method Overloading)
// 2. Runtime Polymorphism (Method Overriding )

// Method Overloading
class Shape{
    private int height,weight,length;
    Shape(int a){
        height=a;
        weight=a;
        length=a;
    }
    Shape(int a,int b){
        height=a;
        weight=b;
        length=a;
    }

    int volumn(){
        return height*weight*length;
    }

    // So method overloading does not depend on the return type of the method, it depends on the number of parameters, the type of parameters, or the order of parameters.
    // void volumn(){
    //     System.out.println("The volumn of cube is: "+a*a*a);
    // }
   
}


class concept1 {
    public static void main(String[] args) {
        Shape cube = new Shape(5);
        Shape cuboid = new Shape(5, 10);
        System.out.println("Volumn of cube: " + cube.volumn());
        System.out.println("Volumn of cuboid: " + cuboid.volumn());
    }
}
