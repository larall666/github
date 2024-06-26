package src;

public class Father implements Swim {

  @Override
  public void swim() {
    // System.out.println("i am swimming");
    // System.out.println("Bye");
  }
  
  public static void main(String[] args) {
    Father father = new Father();
    father.swim();

    //father2.swim();

    Swim mother = ()->{
      System.out.println("i'm mother");
      System.out.println("hello");
    };
    mother.swim();
  }
}
