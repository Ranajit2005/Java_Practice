// Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle create object of the two classes and calculate their area.

interface Shape {
    public double pi = 3.14;

    double calculateArea();

}

class Circle implements Shape{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        
        // System.out.println("The aear of the circle is : ");
        return pi * Math.pow(radius, 2);
        
    }

}

class Rectangle implements Shape{

    private double w,l;

    Rectangle(double w,double l){
        this.w = w;
        this.l = l;
    }

    public double calculateArea(){

        return w * l;
    }


}

public class Practice3 {
    public static void main(String[] args) {

        Shape c = new Circle(3);

        System.out.println("The aear of the circle is : " + c.calculateArea());

        Shape r = new Rectangle(3,5);

        System.out.println("The aear of the Rectangle is : " + r.calculateArea());

    }
}
