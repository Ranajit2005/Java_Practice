// Static and Instance
    //-> Static: 
        //-> Static variable: 
            //-> A variable that is shared among all instances of a class.
            //-> It is initialized only once, at the start
            //-> It is created when the program starts and destroyed when the program stops.
            //-> It is used to refer the common property of all objects (that is not unique for each object), for example, the company name of employees, college name of students, etc.

        //-> Static method:
            //-> A method that belongs to the class rather than any object of the class.
            //-> A static method can access only static data. It cannot access non-static data (instance variables).
            //-> A static method can call only other static methods and can not call a non-static method from it.
            //-> It is used to refer the common property of all objects (that is not unique for each object), for example, the company name of employees, college name of students, etc.
    //->Instance
        //-> Instance variable:
            //-> A variable that is declared inside the class but outside the method.
            //-> It is created when an object of the class is created and destroyed when the object is destroyed.
            //-> It is used to refer to the unique property of an object (that is unique for each object), for example, name, age, salary, etc.

        //-> Instance method:
            //-> A method that belongs to the object of the class.
            //-> A non-static method can access static data. It can access non-static data (instance variables).
            //-> A non-static method can call both static and non-static methods.
            //-> It is used to manipulate the data of an object.


//Example 1:

class Test7{
    static{
        System.out.println("Static block of class A");
    }

    {   //It run every time when object is created
        System.out.println("Instance block of class A");
    }
    Test7(){
        System.out.println("Constructor of class A");
    }

    static void show(){
        System.out.println("Static method of class A");
        //static{     //It gives error because static block can't be inside static method
            //System.out.println("Static block inside static method of class A");
        //}
        {
            System.out.println("Instance block inside static method of class A");
        }
    }

    public static void main(String[] args) {
        Test7 obj = new Test7();
        Test7 obj1 = new Test7();
        obj.show();
    }
}

// public class Test7 {
    
// }
