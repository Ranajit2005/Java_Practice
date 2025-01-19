//Inter thread communication :Consumer consumes item produced by Producer with proper synchronization. MEANS PRODUSER CONSUMER PROBLEM

class ProducerConsumer{

    private final int capacity = 3+1;
    int[] buffer = new int[capacity];
    int val = 1;    //Array index also we follow 1 base index for easy calculation

    public synchronized void producer() throws InterruptedException {

        while(true){

            while(val == capacity){
                System.out.println("Buffer is full");
                wait();
            }

            buffer[val] = val;
            System.out.println("Producer produce item : "+(val)+"th");
            val++;

            notify();
            Thread.sleep(1000);

        }

    }

    public synchronized void consumer() throws InterruptedException {

        while(true){

            while(val == 1){
                System.out.println("Buffer is empty");
                wait();
            }

            val--;
            System.out.println("Consumer consume item : "+val+"th");
            buffer[val] = 0;
            
            notify();
            Thread.sleep(1000);

        }

    }

}

public class Practice26 {
    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.producer();
            } catch (InterruptedException e) {
                System.out.println("Producer Interrupted");
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consumer();
            } catch (InterruptedException e) {
                
                System.out.println("Consumer interrupted");
            }
        });

        producerThread.start();
        consumerThread.start();

    }
}