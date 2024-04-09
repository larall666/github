public class Tes1 {

  public static void main(String[] args) {
  int x = 2;
  x = x * x;
  x *= x;
  System.out.println(x);

  for (int i = 2; i < 5; i++)
  System.out.println("hello " + i);

  String str = "hello world";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'l') {
        count++;
      }
    }
    System.out.println(count);

  for (int i = 0; i < 6; i++) {
    //System.out.print("*");

  }

  int n = 5;
  for (int i = 0; i < n; i++){
    for (int j = 0; j < n - i ; j++){
      System.out.print("2");
    }
    System.out.println();
  }

}
    
  
}
