public class Human {

    String message = "Hello World";

    public static void display(Human human){
        System.out.println(human.message);
    }

    public static void main(String[] args) {
        Human kunal = new Human();
        System.out.println(kunal.message);    
        kunal.message = "Kunal's message";
        Human.display(kunal);

        Human rahul = new Human();
        System.out.println(rahul.message);
    }

}
