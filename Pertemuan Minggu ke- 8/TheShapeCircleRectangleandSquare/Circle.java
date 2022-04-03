/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheShapeCircleRectangleandSquare;

/**
 *
 * @author Sasa
 */
public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle() { 
        radius = 1.0;
    }

    public Circle(double r) { 
        radius = r;
    }
    
    public Circle(double r, String color, boolean filled) { 
        radius = r;
        color = "red";
    }
    
    public double getPerimater() {
        return 2*Math.PI*radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    @Override
    public String toString() { // in Cylinder class // use Circle's toString()
        
        return "Circle : Radius="+ radius+", Base area="
                +getArea()+", Volume="+getPerimater()+"\n"
                +"A Circle with radius = " + radius + ", which is a subclass of " 
                + super.toString()+"\n";
    }
}
