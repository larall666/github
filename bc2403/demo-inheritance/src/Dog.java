package src;

public class Dog extends Animal{

  private Color color;




  public static void main(String[] args) {
  Dog dog = new Dog();
  dog.setName("Sally");
  System.out.println(dog.getName()); // "Sally"
  }




  // private char[] getName() {
  //   // TODO Auto-generated method stub
  //   throw new UnsupportedOperationException("Unimplemented method 'getName'");
  // }




  // private void setName(String string) {
  //   // TODO Auto-generated method stub
  //   throw new UnsupportedOperationException("Unimplemented method 'setName'");
  // }
}
