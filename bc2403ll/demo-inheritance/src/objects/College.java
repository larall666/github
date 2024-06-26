package src.objects;

import java.util.Objects;

public class College {
  private double area;

  public double getArea(){
    return this.area;
  }

  //equals()
  @Override
  public boolean equals (Object obj){
  if (this==obj)
  return true;
  if (!(obj instanceof College))
  return false;
  College c = (College)obj;
  return Objects.equals(this.area, c.getArea());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.area);
  }

  @Override
  public String toString(){
    return "College("//
    +"area="+ this.area//
    +")";
  }



  public static void main(String[] args) {
    Object o = new College();
   System.out.println(o.hashCode());
   System.out.println(o.equals(new College()));
   System.out.println(o);

    if (o instanceof College){
      College c2 = (College)o;
    }

    Class<?> s= o.getClass();
    System.out.println(s.getName());

    
  }
}
