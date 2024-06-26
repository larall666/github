package src;

public interface Calculator {
  int square(int x);

  public static void main(String[] args) {
    Calculator calculator=(x)->{
      return (int)Math.pow(x, 2);
    };
    System.out.println(calculator.square(3));//9

    Calculator calculator2=x-> (int)Math.pow(x, 2);//3 of 2次方
    System.out.println(calculator2.square(3));//9

    Calculator calculator3=x->3;
    System.out.println(calculator3.square(0));
    System.out.println(calculator3.square(4));
    System.out.println(calculator3.square(10));
  }
}
