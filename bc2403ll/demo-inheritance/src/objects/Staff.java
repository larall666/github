package src.objects;

import java.time.LocalDate;


public class Staff {

  private LocalDate joinDate;

  public Staff(LocalDate joinDate){
    this.joinDate = joinDate;
  }

  public LocalDate getjoinDate{
    
  }

  public static void main(String[] args) {
    Object o = new Object();
    System.out.println(o.toString());

    Staff s new Staff(LocalDate.now());
    System.out.println(s.toString());
  }
  
}
