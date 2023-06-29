import java.util.*;
public class Basics {
    static int x = 10;
    public static void main(String[] args) {
        func();
    }
    public static void func(){
        int x = 5;
        // local variable
        System.out.println(x); //5

        //global variable with same name
        // NameSpace collision
        System.out.println(Basics.x); //10

        Basics.x = 75;
        x = 50;
        System.out.println(Basics.x + " "+x); //75
    }
    public int add(int x){
        return (x+Basics.x);
    }
}
