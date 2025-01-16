//package Practice;

//Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: public String toString () { } in every class where you describe about the class and from main create object of each class and print each object. Do the problem 4 using dynamic method dispatching

class EMP{
    String name;
    int id;

    EMP(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Name: " + name + "ID : " + id;
    }

}

class Scientist extends EMP{
    int no_of_publication;
    int experience;

    Scientist(int a,int b){
        super("Scientist",2);
        this.no_of_publication = a;
        this.experience = b;
    }

    public String toString(){
        return "Name: "+name+" ID: "+id+" No of publication: "+no_of_publication+" Experience: "+experience;
    }

}

class Dscientist extends Scientist{
    String award;

    Dscientist(String award,int no_of_publication,int experience){
        super(no_of_publication,experience);
        this.award = award;
    }

    public String toString(){
        return "Name: "+name+" ID: "+id+" No of publication: "+no_of_publication+" Experience: "+experience+" Award: "+award;
    }
    
}

public class Practice2 {
    public static void main(String[] args) {

        EMP e = new EMP("EMP",1);
        System.out.println(e);

        Scientist s = new Scientist(2,3);
        System.out.println(s);

        Dscientist ds = new Dscientist("abc",4,5);
        
        System.out.println(ds);
        
    }
}

// Implicit Call to toString():
// When you pass an object to System.out.println(), Java implicitly calls the toString() method of that object.
// For example, System.out.println(obj); is equivalent to System.out.println(obj.toString());


// Override of toString():
// When you override the toString() method in your class, Java uses your custom implementation instead of the default one defined in the Object class (which simply returns the class name and hash code).