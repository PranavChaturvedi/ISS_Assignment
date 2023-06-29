package MultiThreading;

public class VolatileUsage {
    //This class represents a singleton design pattern where volatile keyword is useful
    public static volatile VolatileUsage currentObj = null;
    private VolatileUsage(){
        System.out.println("Class is instantiated");
    }
    public static VolatileUsage getCurrentObj(){
        if(currentObj == null){
            synchronized (VolatileUsage.class){
                if(currentObj == null){
                    currentObj = new VolatileUsage();
                }
            }
        }
        return currentObj;
    }
}
