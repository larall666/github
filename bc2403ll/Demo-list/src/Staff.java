import java.util.HashSet;
import java.util.Arrays;
import java.util.Objects;

public class Staff {

  private String name;

  public Staff(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }

    @Override 
    public boolean equals(Object obj){
      if (this==obj)
      return true;
      if (!(obj instanceof Staff))
      return false;
      Staff Staff=(Staff) obj;
    
      return Objects.equals(this.name, Staff.getName())
    }
  
    @Override
    public int hashCode(){
      return Objects.hash(this.name);
    }

    @Override
    public String toString(){
      return "staff("//
      +"name="+this.name//
      +")";
    }
  
  
  public static void main(String[] args) {
    
  HashSet<Staff>staffs=new HashSet<>();
  staffs.add(new Staff("Vincent"));
  staffs.add(new Staff("Oscar"));
  System.out.println(staffs.size());

    // add -> false
    System.out.println(staffs.add(new Staff("Vincent"))); // false
    System.out.println(staffs.size()); // 2

  HashSet<Integer> integers2 = new HashSet<>();
  for(Integer x : integers){
  integers2.add(x);
  }
  System.out.println(integers2);
  
}
}
