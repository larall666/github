public class Staff {
  private String name;

  //Static Final Variable(belongs to class)
  public static final double PI=3.14259;

  //Final Variable(belongs to object)
  private final int HOR_OF_DAY=24;

//Instance Method
public double getSalary(){
  return this.getsalary;
}

//Instance Method
public double getHoursOfDay(){
  return this.HOR_OF_DAY;
}

  //Constructor
  public Staff(String name){
    this.name=name;
  }

//Static Method
private static int ageLimit;

//Static Method
public static Staff of(String name){
  return new Staff(name);
}

//Static Variable
public static int ageLimit;

public static void main(String[] args) {
  Staff.age_limit=10;
  System.out.println(Staff.age_limit);
  Staff.age_limit =12;

  Staff s1 = Staff.off("Vincent");
  System.out.println(s1.ageLimit);

  //fINAL Instancn Varible
  System.out.println();

}

// Instance Method
}
