package MultiThreading;

public class SynchronizedStack {
    //This class implements a stack where push and pop are synchronized
    // This means only one thread can access a method at a time
    private int[] arr;
    private int stackTop;
    public SynchronizedStack(int capacity){
        arr = new int[capacity];
        stackTop = -1;
    }
    public boolean isEmpty(){
        return stackTop<0;
    }
    public boolean isFull(){
        return stackTop >= arr.length - 1;
    }

    public synchronized boolean push(int element){
        if(isFull())return false;
        stackTop++;
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){e.printStackTrace();}
        arr[stackTop] = element;
        return true;
    }
    public synchronized int pop(){
        if(isEmpty())return Integer.MIN_VALUE;
        int e = arr[stackTop];
        arr[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        stackTop--;
        return e;
    }

}
