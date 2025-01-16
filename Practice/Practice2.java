//package Practice;

//Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: public String toString () { } in every class where you describe about the class and from main create object of each class and print each object.

class EMP{
    String name;
    int id;

    public String toString(){
        return "Name: " + name + "ID : " + id;
    }

}

class Scientist extends EMP{
    int no_of_publication;
    int experience;

    public String toString(){
        return "Name: "+name+" ID: "+id+" No of publication: "+no_of_publication+" Experience: "+experience;
    }

}

class Dscientist extends Scientist{
    String award;

    public String toString(){
        return "Name: "+name+" ID: "+id+" No of publication: "+no_of_publication+" Experience: "+experience+" Award: "+award;
    }
    
}

public class Practice2 {
    public static void main(String[] args) {

        EMP e = new EMP();
        e.name = "EMP";
        e.id = 1;
        System.out.println(e);

        Scientist s = new Scientist();
        s.name = "Scientist";
        s.id = 2;
        s.no_of_publication = 3;
        s.experience = 4;
        System.out.println(s);

        Dscientist ds = new Dscientist();
        ds.name = "Dscientist";
        ds.id = 3;
        ds.no_of_publication = 5;
        ds.experience = 6;
        ds.award = "Best Scientist";
        System.out.println(ds);
        
    }
}

// Implicit Call to toString():
// When you pass an object to System.out.println(), Java implicitly calls the toString() method of that object.
// For example, System.out.println(obj); is equivalent to System.out.println(obj.toString());


// Override of toString():
// When you override the toString() method in your class, Java uses your custom implementation instead of the default one defined in the Object class (which simply returns the class name and hash code).