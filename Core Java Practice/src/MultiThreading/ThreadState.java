package MultiThreading;

public class ThreadState {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        thread.start();
        while(true){
            Thread.State state = thread.getState();
            System.out.println(state);
            if(state == Thread.State.TERMINATED)break;
        }
    }
}
