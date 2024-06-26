public class Student {
  //public static String collegeName = "ABC";
  public static final String collegeName;
  public static String abc = initialize();

  //instance variable
  private String name;

  public static String initialize(){
    System.out.println("initialize()");
    return "hello";
  }

  static{
    System.out.println("static Block");
    System.out.println("initialize()");
    collegeName = "ABC";
    abc="world";
  }

  //instance block
  {
    System.out.println("instance block");
    this.name="John";
  }

  public Student(String name){
    System.out.println("Constructor");
    this.name=name;
  }

public static void main(String[] args) {
  System.out.println("main start");
  Student s=new Student("Jenny");
  Student s2=new Student("Sally");
  System.out.println(s2);
  System.out.println("abc="+abc);
  System.out.println("main end");
}

}
