/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheShapeCircleRectangleandSquare;

/**
 *
 * @author Sasa
 */
public class Square extends Rectangle{
    
    public Square(){
        super();
        double side=1.0;
    }
    public Square(double width, double length){
        super(width,length );
    }
    
    public Square(double width, double length, String color, boolean filled){
        super(width, length, color, filled);   
    }
    
    public Square(double side) {
      super(side, side); // Call superclass Rectangle(double, double)
      side=side;
    }
    
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    public void setLength(double side){
        super.setLength(side);
    }
    
    public double getSide() {
        return super.getWidth();
    }
    
    public double getArea(){
        return getSide()*getSide();
    }
    
    public double getPerimater() {
        return 4*getSide();
    }
    
    @Override
    public String toString()  {
      return "Square : Side="+ getSide()+", Base area="
              +getArea()+", Volume="+getPerimater()+"\n"
              +"A Square with side = " + getSide() 
              + ", which is a subclass of " + super.toString()+"\n";
   }
    
}
