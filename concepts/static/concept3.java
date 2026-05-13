class Human{
    String name;
    int age;
    static long population;     // static is belong to class, not object. So it used as a shared memery


    Human(String s, int age){
        name = s;
        this.age = age;
        Human.population++;     // We don't use this, use class name because population is static variable, it is belong to class not object and this belong to object. So we use class name to access static variable
    }


    static void getName(){
        // System.out.println(name);   // We can't access non static variable in static function because static function is belong to class and non static variable is belong to object, so we can't access non static variable in static function because we don't know which object we want to access. So we can't access non static variable in static function. We can only access static variable in static function because static variable is belong to class and static function is belong to class, so we can access static variable in static function.
    }

    void getPopulation(){
        System.out.println(population);  // We can access static variable in non static function because non static function is belong to object and static variable is belong to class, so we can access static variable in non static function because we know which object we want to access. So we can access static variable in non static function.
        // System.out.println(name);
    }

}



public class concept3 {
    public static void main(String[] args) {

        Human H1 = new Human("Ram", 10);

        // System.out.println(H1.population);  // We can access static variable by object but it is not recommended, it works beacause static variable is shared by all object, so it is not belong to any object, it is belong to class. So we should access static variable by class name  
        System.out.println(Human.population);

        Human H2 = new Human("Shaym", 20);

        System.out.println(Human.population);  // population is increase by 1 because we create one more human 
        
    }
}
