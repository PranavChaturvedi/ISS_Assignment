package MultiThreading;

public class SynchronizedTesting {
    public static void main(String[] args) {
        System.out.println("Main begins");

        SynchronizedStack stack = new SynchronizedStack(5);

        new Thread(() -> {
            int counter = 0;
            while(++counter < 10){
                System.out.println("Pushed : " + stack.push(100));
            }
        },"Pusher").start();

        new Thread(() -> {
            int counter = 0;
            while(++counter < 10){
                System.out.println("Popped : " + stack.pop());
            }
        },"Popper").start();

        //We will get an ArrayIndexOUB exception here if method in
        // stack are not synchronized
    }
}
