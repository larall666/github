import java.time.LocalDate;

public class HKlocalDate {
  private LocalDate[] holiday;
  private LocalDate date;
  public HKlocalDate(int year, int month, int day){
    this.date = LocalDate.of(year, month,day);
  }
  
}
