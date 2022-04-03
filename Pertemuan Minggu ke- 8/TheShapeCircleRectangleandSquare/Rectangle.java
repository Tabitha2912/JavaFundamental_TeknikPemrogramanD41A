/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheShapeCircleRectangleandSquare;

/**
 *
 * @author Sasa
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public Rectangle() { 
        this.width=1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) { 
        this.width=width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled) { 
        super(color, filled);
        this.width=width;
        this.length = length;
    }
    
    public double getPerimater() {
        return (2*length)+(2*width);
    }
    
    public double getArea(){
        return width*length;
    }
    
    @Override
    public String toString() { // in Cylinder class // use Circle's toString()
   
         return "Rectangle : Width="+ getWidth()+", Length="+ getLength()
                +", Base area="+getArea()+", Volume="+getPerimater()+"\n"
                +"A Rectangle with width = " + width + "and length = " 
                + length + ", which is a subclass of " + super.toString()+"\n";
    }
}
