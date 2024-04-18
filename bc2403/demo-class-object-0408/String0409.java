public class String0409 {
  private char[] characters = new char[0];

  public String concat(String s){
    char[] newArr = new char[this.characters.length + s.length()];
    int idx = 0;
    for (int i =0;i<characters.length;i++){
      newArr[idx++] = characters[i];
    }
    for (int i = 0; i<s.length();i++){
      newArr[idx++] = s.charAt(i);
    }
    return String.valueOf(newArr);
  }

  // public void setValue(String s){
  //   //return this.s;
  //   this.characters = new char[s.length()];
  //   for (int i=0;i<s.length();i++){
  //   this.characters[i]=s.charAt(i);
  //   }
  // }

  public String getValue(){
    //return this.characters;
    String s = "";
    for (int i = 0;i<this.characters.length;i++){
      //s=s+this.character[i]; or
      s=s.concat(String.valueOf(this.characters[i]));

    }
    return s;
  }

public static void main(String[] args) {
  String0409 str = new String0409();

  char[] arr = new char[] {'c', 'd', 'e'};
  //str.setcharacters(arr);
  System.out.println("get="+str.getValue());
  str.setValue("cde");

  System.out.println("get="+str.getValue());

  String1 str2 = new String1("hello");
  System.out.println(str2);
  
  String result = str2.concat("world");
  System.out.println(str2);
  System.out.println(result);
}

}
