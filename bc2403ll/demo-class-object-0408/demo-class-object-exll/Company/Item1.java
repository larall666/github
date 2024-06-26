package Company;



public class Item1 {
  private String desc;
  private double price;
  private int quantity;

  public Item1(String desc, double price, int quantity) {
    this.desc = desc;
    this.price = price;
    this.quantity = quantity;
  }

// public double subtotal(){
//   return BigDecimal.valueOf(this.price) //
//   .multiply(BigDecimal.valueOf(this.quantity))//
//   .doubleValue();
// }

  public String toString() {
    return "Item[" //
        + "description=" + this.desc //
        + ", price=" + this.price //
        + ", quantity=" + this.quantity //
        + ")";
  }

  public static void main(String[] args) {
    Item1 item1 = new Item1("SCREW", 18.6, 2);
    Item1 item2 = new Item1("BOLT", 16.2, 10);
    Item1[] items = new Item1[2];
    items[0] = item1;
    items[1] = item2;

    Order1 order1 = new Order1("E0003V", items);
    Order1[] orders = new Order1[1];
    orders[0] = order1;
    
    Company c = new Company("UK Company", orders);
    System.out.println(c);

   
  }
}
