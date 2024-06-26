package src;

public class BCList<T,U> {
  private T data1;
  private U data2;

  public BCList(T data1, U data2){
    this.data1=data1;
    this.data2=data2;
  }

  public T getData1(){
    return this.data1;
  }

  public U getData2(){
    return this.data2;
  }

  public static<V extends Number>double sum(V number1, V number2){
    System.out.println(number1.getClass());
    System.out.println(number2.getClass());
    return number1.doubleValue()+number2.doubleValue();
  }

  public static void main(String[] args) {
    BCList<String, Integer> bclist = new BCList<>("hello", 56);
    System.out.println(bclist.getData1());
    System.out.println(bclist.getData2());

    BCList<Integer, Integer> bclist2 = new BCList<>(100,12);
    System.out.println(bclist2.getData1());
    System.out.println(bclist2.getData2());
    sum(Integer.valueOf(13), Long.valueOf(20));
    
  }

}
