

public class String0409 {
  private char[] characters = new char[0];

  public void setValue(String s){
    //return this.s;
    this.characters = new char[s.length()];
    for (int i=0;i<s.length();i++){
    this.characters[i]=s.charAt(i);
    }
  }

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
}

}
