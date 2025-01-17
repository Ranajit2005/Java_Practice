// Implement a class from Runnable and override the run( ) method. Inside run( ), print full qualified name of thread, and then call sleep( ). Repeat this three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and main thread run to see what happens

class A implements Runnable{

    A(){
        System.out.println("Thread is started");
    }

    public void run(){

        String n = Thread.currentThread().getName();

        try{

            for(int i=0;i<3;i++){
                System.out.println(n);
                Thread.sleep(1000);
            }

        }catch(InterruptedException e){

        }
    }

}

public class Practice8 {
    public static void main(String[] args) {

        A a = new A();
        Thread t = new Thread(a,"Thread 1");
        t.start();

        String n = Thread.currentThread().getName();

        try {
            for(int i=0;i<3;i++){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            
        }
        
    }
}
