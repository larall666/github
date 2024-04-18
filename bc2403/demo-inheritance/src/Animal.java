package src;

public class Animal {

    public static String x ="abc";
    private static String name;
   

    public Animal(String name) {
        this.name = name;
      }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }



public void sleep(){
    System.out.println("Sleeping...");
  }

  public void run(){
    System.out.println("Running...");
  }

  public void hello(){
    System.out.println("hello");
  }

  public String lowerY(){
    return Cat.y.toLowerCase();
  }

  public static void main(String[] args) {
    Cat c = new Cat(12, "Eric");
    Cat c2 = new Cat(4, "Vincent");
    //c.setName("Sally");
    System.out.println(c.getAge());
    System.out.println(c.getName());

    Animal animal = new Animal(name);
    System.out.println(animal.lowerY());
    
  }


}
