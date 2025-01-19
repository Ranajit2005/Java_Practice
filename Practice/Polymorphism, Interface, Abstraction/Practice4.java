// Create a class which contains an inner class. Show that inner class can use member of outer class directly, but Outer class can use member of Inner class only through its object. Check the name of class file, you created

class OuterClass{

    private String OuterString = "Hellow from OuterClass";

    class InnerClass{

        private String InnerString = "Hellow from InnerClass";

        public void msgOuterFromInner(){
            System.out.println(OuterString);
        }

        public void msgInnerFromInner(){
            System.out.println(InnerString);
        }

    }

    public void msgInnerFromOuter(){
        // System.out.println(InnerString);    //Gives error

        InnerClass inner = new InnerClass();
        inner.msgInnerFromInner();
    }

}


public class Practice4 {
    public static void main(String[] args) {

        OuterClass a = new OuterClass();
        a.msgInnerFromOuter();

        OuterClass.InnerClass b = a.new InnerClass();   // NOTE

        b.msgInnerFromInner();
        b.msgOuterFromInner();
        
    }
    
}
