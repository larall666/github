import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Item {
  private String desc;
  private double price;
  private int quantity;

  public static void main(String[] args) {
    Item item1 = new Item("SCREW", 18.6, 2);
    Item item2 = new Item1("BOLT", 16.2, 10);
    Item[] items = new Item[2];
    items[0] = item1;
    items[1] = item2;

    Order1 order1 = new Order1("E0003V", items);
    Order1[] orders = new Order1[1];
    orders[0] = order1;
    
    Company c = new Company("UK Company", orders);
    System.out.println(c);

   
  }
}
