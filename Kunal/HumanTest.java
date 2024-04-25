public class HumanTest {

    String message = "Hello World";

    public static void display(HumanTest human){
        System.out.println(human.message);
    }

    public static void main(String[] args) {
        HumanTest kunal = new HumanTest();
        System.out.println(kunal.message);    
        kunal.message = "Kunal's message";
        HumanTest.display(kunal);

        HumanTest rahul = new HumanTest();
        System.out.println(rahul.message);
    }

}

