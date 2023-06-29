package MultiThreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private int capacity;
    private Queue<Integer> q;
    public BlockingQueue(int cap){
        capacity = cap;
        q = new LinkedList<>();
    }

    public boolean add(int element){
        synchronized (q){
            while(q.size() == capacity){
                try{
                    q.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            q.add(element);
            q.notifyAll();
            return true;
        }
    }

    public int remove(){
        synchronized (q){
            while(q.size() == 0){
                try{
                    q.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            int r = q.poll();
            q.notifyAll();
            return r;
        }
    }
}
