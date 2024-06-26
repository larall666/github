package src.shapesll;

import java.math.BigDecimal;



public interface Shape {

  //public static final String s = "hello";
  //or
  String s = "hello";
  
  double area();
  BigDecimal PI = BigDecimal.valueOf(Math.PI);

  String print();

// public static double area(Square[] squares){

// }

// public static double area(Circle[] circles){

// }
//or

public static double area(Shape[] shapes){
BigDecimal sum = BigDecimal.valueOf(0.0);
for (Shape shape: shapes){
  sum=sum.add(BigDecimal.valueOf(shape.area()));
}
  return sum.doubleValue();
}


  public static void main(String[] args) {
    System.out.println(Shape.s);
    System.out.println(Shape.PI.doubleValue());
    Shape[] shapes=new Shape[3];
    shapes[0]=new Circle();
    shapes[1]=new Square();
    shapes[2]=new Circle();

  System.out.println(sum.doubleValue());
  
  }
}
