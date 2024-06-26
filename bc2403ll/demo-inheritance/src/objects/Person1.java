package src.objects;

import src.Color;

public class Person1 {
  private Dog dod;

  public Dog dog(){
    return this.dog;
  }

  public void setDog (Dog dog){
    this.dog=dog;
  }

  public static void main(String[] args) {
    Person vincent = new Person();
    vincent.setDog(new Dog(Color.BLACK));
    Dog vincent = vincent.getDog();
    

  }
}
