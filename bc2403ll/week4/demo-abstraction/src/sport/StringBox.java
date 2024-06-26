package src.sport;

public interface StringBox {
  void run();
  void walk();
  default void swim(){
    System.out.println("Default method: swim...");
  }
static void sleep(){
  System.out.println("Default method: sleep...");
}
public static void main(String[] args) {
  StringBox.sleep();
  
}
}
