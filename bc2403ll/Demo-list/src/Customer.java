package src;

import java.util.Objects;

public class Customer {

  private String name;

  public Customer ( String name) {
        this.name = name;
  }

  @Override
  public String toString(){
    return "Customer("//
    +"name="+ this.name//
    +")";
  }

  @Override
  public boolean equals(Object obj){
    if (this==obj)
    return true;
    if (!(obj instanceof Customer))
    return false;
    Customer customer=(Customer) obj;
    return Objects.equals(this.name, customer.getName());
  }


  String getName() {
   return this.name;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

}
