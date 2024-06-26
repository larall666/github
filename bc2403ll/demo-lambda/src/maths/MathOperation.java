package src.maths;

public interface MathOperation {
double operate(double x, double y);
  
static double calculate (int x, int y, MathOperation mo){
  return mo.operate(x, y);
}
  public static void main(String[] args) {
    MathOperation addition=(a,b)->a+b;
    MathOperation subtract=(a,b)->a-b;
    MathOperation multiply=(a,b)->a*b;
    MathOperation divide=(a,b)->a/b;

    System.out.println(MathOperation.calculate(100,5,divide));
    System.out.println(MathOperation.calculate(100,5,addition));
    System.out.println(MathOperation.calculate(100,5,multiply));
    System.out.println(MathOperation.calculate(100,5,subtract));
  }
}
