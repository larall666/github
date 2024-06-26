package src;

public class Printer<T> {
  private T data;

  public Printer(T data){
    this.data=data;
  }

  public void print(){
    System.out.println(data.toString());
  }

  public static void main(String[] args) {
    Printer<String> ps = new Printer<>("hello");
    ps.print();

    Printer<Integer> is = new Printer<>(3);
    is.print();
  }
}
