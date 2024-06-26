package src.shape;

public class Circle implements Shape{

  private double radius;

  public Circle(double radius){
    this.radius=radius;
  }

  @Override
  public double area(){
    return this.radius*radius*Math.PI;
  }
  
  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius=radius;
  }
}
