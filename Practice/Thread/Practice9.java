// Make several threads (say 5) with names (by extending thread), set their priority and run them to see what happens.

class A extends Thread{

    public void run(){

        String n = Thread.currentThread().getName();

        try {
            Thread.sleep(1000);
            System.out.println(n);
            System.out.println(Thread.currentThread().getPriority());
        } catch (InterruptedException e) {
            
        }
    }
 }

 class B implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }

 }

public class Practice9 {
    public static void main(String[] args) {

        // A t1 = new A();
        // A t2 = new A();
        // A t3 = new A();
        // A t4 = new A();
        // A t5 = new A();

        B t11 = new B();
        B t12 = new B();
        B t13 = new B();
        B t14 = new B();
        B t15 = new B();

        Thread t1 = new Thread(t11);
        Thread t2 = new Thread(t12);
        Thread t3 = new Thread(t13);
        Thread t4 = new Thread(t14);
        Thread t5 = new Thread(t15);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        t5.setName("Thread 5");

        t1.setPriority(1);
        t2.setPriority(9);
        t3.setPriority(10);
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
