package src.Test;

public class Person implements Test {
  @Override
  public void run(){
    System.out.println("run...");

  }
  @Override
  public void walk(){
    System.out.println("walk...");
  }
  @Override
  public void swim(){
    
  }

  public static void main(String[] args) {
    Run vincent = new Person();
    vincent.run();
  }
}
