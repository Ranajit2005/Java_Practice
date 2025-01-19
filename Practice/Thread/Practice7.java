// Inherit a class from Thread and override the run( ) method. Inside run( ), print name of thread , and then call sleep( ). Repeat this three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and main thread run to see what happens.

class A extends Thread{

    A(String name){
        super(name);
        System.out.println(name + " is started");
    }

    public void run(){
        
        String n = Thread.currentThread().getName();

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            
        }
    }
}

public class Practice7 {
    public static void main(String[] args) {

        A t1 = new A("Thread 1");
        t1.start();

        String n = Thread.currentThread().getName();

        for (int i = 0; i < 3; i++) {

            try {
                System.out.println(n);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
        
    }
}
