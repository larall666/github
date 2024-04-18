package src.shapes;

import java.math.BigDecimal;

public class Circle implements Shape {

  private double radius;

  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(Shape.PI)//
    .doubleValue();
  }

  @Override
  public String print(){
    return String.valueOf(this.radius);
  }

  public static void main(String[] args) {
    Shape s = new Circle();
    s.area();
    s.print();

  }
  
}
