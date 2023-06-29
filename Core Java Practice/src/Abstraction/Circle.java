package Abstraction;

public class Circle extends Shape {
    String colour;
    int radius;
    public Circle(String colour,int radius){
        this.colour = colour;
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public void result(){
        System.out.println("The colour of circle is : " + this.colour +" and the area is : " + area());
    }
}
