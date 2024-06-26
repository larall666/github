package src.cat;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{
  public static void addCat(List<?super Cat>cats){
cats.add(new Cat());
  }

  public static void addCat2(List<Cat> cats){

  }

  public static <T extends Cat>void addCat3(List<T> cats){
    
}

public static void main(String[] args) {
  addCat(new ArrayList<>(List.of(new Animal(),new Animal())));
 // System.out.println(addCat(null););
}
}
