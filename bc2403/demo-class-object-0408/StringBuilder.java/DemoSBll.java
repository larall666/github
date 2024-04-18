public class DemoSBll {
  public static void main(String[] args) {
    String [] strings=new String[] {"aaa","bbb","ccc"};
    StringBuilder sb4 = new StringBuilder();
    for (String s : strings){
      sb4.append(s);
    }System.out.println(sb4.toString());
  
  
  //insert
  sb4.insert(6,"mmm");
  System.out.println(sb4.toString());

  sb4.deleteCharAt(5);
  System.out.println(sb4.toString());

  sb4.setCharAt(3,'o');
  System.out.println(sb4.toString());

  sb4.replace(0,2,"!");
  System.out.println(sb4.toString());

String result10 = sb4.toString().replace("b", "y");

System.out.println(result10);

  }
}
