package MultiThreading;

public class ThreadsBasics {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread(1);
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();

        //join() stops the execution of the main thread
        // it can also except milliseconds as argument
        thread1.join(3000);
        thread2.start();
        thread2.join();
        //Daemon threads have less priority than user threads(thread1 & thread2)
        // If the main thread interrupts, if any one thread is a user thread then all threads continue
        // else if all threads are daemon, then no thread executes
        MyThread thread3 = new MyThread(3);
        thread3.setDaemon(true);
        thread3.start();

        //Multiple implementation is supported in java but multiple inheritance is not
        // so MyRunnable objects are better here(more customizability)

        throw new ArithmeticException();
    }
}
