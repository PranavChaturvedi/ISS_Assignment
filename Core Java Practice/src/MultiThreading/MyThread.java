package MultiThreading;

public class MyThread extends Thread{
    int threadID = 0;
    public MyThread(int x){
        threadID = x;
    }
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Thread " + threadID +" : " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadID+" finished");
    }
}
