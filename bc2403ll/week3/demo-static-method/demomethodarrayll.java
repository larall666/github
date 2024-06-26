import java.util.Arrays;

public class demomethodarrayll{
  public static void main(String[] args) {
    double[] prices = new double[] {2.0, 2.3, 5.1};
    int[] quantities = new int [] {2,4,5};
    double totalAmount = total(prices, quantities);
    System.out.println("totalAmount="+totalAmount);
    //System.out.println("totalAmount="+subTotal);

    String[] ss = new String[] {"a a a  ", "bb b"};
    String[] ss2 = trimSpace(ss);
    System.out.println(Arrays.toString(ss2));//[aaa,bbb]
    
  }

public static String trimSpace(String s){
  return s.replace(" ", "");
}

// return {"aaa", "bbb"}
public static String[] trimSpace(String[]ss){
String[] strings = new String[ss.length];
for (int i=0;i<strings.length;i++){
  strings[i]=ss[i].replace(" ", "");
}
return strings;
}
  //method totalAmount -> call subTotal()

  public static double total(double[] price, int[] quantities){
double totalAmount = 0.0d;
for(int i =0;i <price.length;i++){
  totalAmount += subTotal(price[i], quantities[i]);

  }
  return totalAmount;

}
  
  //method subtototal(double price, int quantity)
  public static double subTotal(double price, int quantity){
 return price * quantity;
  }

}