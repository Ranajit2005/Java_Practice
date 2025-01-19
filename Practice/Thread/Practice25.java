//Write a program to use join() and isAlive() in Multi-Threading.

class T extends Thread{

    public void run(){
        String s = Thread.currentThread().getName();

        for(int i=0;i<3;i++){
            System.out.println(s);
        }
    }
}

public class Practice25 {
    public static void main(String[] args) {
        
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thresd 3");

        System.out.println("Thread 1 is alive : "+t1.isAlive());

        t1.start();
        t3.start();
        t2.start();

        System.out.println("Thread 1 is alive : "+t1.isAlive());

        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
