package src.shape;

import java.math.BigDecimal;

public class Square extends Shape{
  private double length;

  @Override
  public double area(){
    return BigDecimal.valueOf(this.length)//
    .multiply(BigDecimal.valueOf(this.length))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
  }

  public double area2(){
    return BigDecimal.valueOf(this.length)//
    .multiply(BigDecimal.valueOf(this.length));
  }
}
