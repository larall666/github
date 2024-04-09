public class Dog {
  

  public static void main(String[] args) {
    
    Dog dog = new Dog();
    dog.setFristName("John");
    dog.setLastName("Lau");
    dog.setAge(8);
 //   dog.setFullName("JohnLau");
    //System.out.println("color="+ c.getCKolor());
    System.out.println(dog.toString());
    System.out.println(dog.fullName());


  }

  private String FristName;
  private String LastName;
  private int Age;

  public void setFristName (String FristName){
    this.FristName = FristName;
  }
  
  public String getFristName(){
    return this.FristName;
  }

  public void setLastName (String LastName){
    this.LastName = LastName;
  }
  
  // public String getLastName(){
  //   return this.LastName;
  // }

  public void setAge (int Age){
    this.Age = Age;
  }
  
  // public int getAge(){
  //   return this.Age;
  // }
  
  public String toString(){
    return "dog("
    +"FristName="+this.FristName
    +",LastName=" +this.LastName
    +", Age="+this.Age
    +")";
  }

  public String fullName(){
  return this.FristName.concat(" ").concat(this.LastName);
  }

 





}
