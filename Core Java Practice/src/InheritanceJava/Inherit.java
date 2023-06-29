package InheritanceJava;
public class Inherit extends InheritanceJava.Inheritance {
    int x = 20;
    @Override
    public void display() {
        System.out.println("display() of subclass");
    }

    public static void main(String[] args) {
        Inherit obj = new Inherit();
        obj.function();
    }
    public void function(){
        Inherit obj = new Inherit();
        obj.display();
        super.display();
        System.out.println("Local Class x : " + x);
        System.out.println("Super Class x : " + super.x);
    }
}
