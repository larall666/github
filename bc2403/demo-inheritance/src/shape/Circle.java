package src.shape;

import java.math.BigDecimal;

public class Circle extends Shape {
  private double radius;

  public double area(){
return BigDecimal.valueOf(this.radius)//
.multiply(BigDecimal.valueOf(this.radius))//
.multiply(BigDecimal.valueOf(Math.PI))//
.doubleValue();
  }

@Override
public boolean equals(Circle o){
  return this.radius == o.getRadius();
}
}

public static void main(String[] args){
  Circle c = new Circle();
  Circle c2 = new Circle();
  Circle c3 = c;

  System.out.println(c.equals(c2));
  System.out.println(c.equals(c3));
}
}