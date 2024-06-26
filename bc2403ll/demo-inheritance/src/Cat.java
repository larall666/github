package src;

public class Cat extends Animal{

  public static String y = "DEF";

  private int age;



public Cat(){

}

  private int weight;

  private String name;


  public void cat (int age){
    this.age=age;
  }

  public Cat(int age, String name) {
    super(name);
    this.age=age;
  }





  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age=age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String string) {
    this.name = string;
  }

  // Approach 1
  public String getCatName() {
    return this.name;
  }

  public void setCatName(String name) {
    this.name = name;
  }

  // Approach 2
  public String getAnimalName() {
    return "name=" + super.getName();
  }

  public void sleep(){
    System.out.println("Cat is sleeping...");
  }

  public String upperX() {
    return Animal.x.toUpperCase();
  }

  public static void main(String[] args) {
    Cat cat = new Cat(12, "Jenny");
    cat.setName("Jenny");
   
    System.out.println(cat.getName()); // "Jenny"
    cat.setAge(10);
    System.out.println(cat.getAge());
    cat.sleep();
    cat.run(); // Running ...

    Cat c2 = new Cat(5, "Sam"); // super("Jenny")
    c2.setCatName("Vincent");
    System.out.println(c2.getCatName()); // Vincent
    System.out.println(c2.getName()); // Jenny

    System.out.println(c2.getAnimalName()); // Jenny

    System.out.println(c2.upperX()); // ABC
    // New Animal



    // Cat has its own instance variable

    // Another child class extends Animal
    
  }
  
}
