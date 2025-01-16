//package practice;
//1. Create a class and test if method overloading holds good for return type of method or not.
//2. Overload the constructors for class Box for cube and cone and also display its volume.
class Test{
    void method(){
        System.out.println("Method from void return type");
        
    }

    //Answer of question 1
    //It gives error. Means method overloading does not hold good for return type of method.
    // int method(){
    //     System.out.println("Method from int return type");
    //     return 0;
    //}
    
}

//Answer of question 2
class Box{
    private double side = 0;
    private double height = 0;
    private double radius = 0;

    Box(double side){
        this.side = side;

        System.out.println("Volume of cube is: "+(side*side*side));
    } 

    Box(double height,double radius){
        this.height = height;
        this.radius = radius;

        System.out.println("Volume of cone is: "+((Math.PI * Math.pow(radius, 2) * height)/3));
    }



}

public class Practice1{
    public static void main(String[] args){
        Box b = new Box(5);
        Box b1 = new Box(5,11);
    }
}
