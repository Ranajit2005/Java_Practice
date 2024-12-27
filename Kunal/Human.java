public class Human {
    int age;
    String name;
    static long population;

    public Human(int age,String name){
        this.age = age;
        this.name = name;
        Human.population += 1;
    }

    public static void main(String[] args) {
        // Human Ranajit = new Human(19, "Ranajit");
        // Human Bittu = new Human(19,"Bittu");
        // Human Bittu2 = new Human(19,"Bittu");
        System.out.println("The population is : "+Human.population);
    }
}
