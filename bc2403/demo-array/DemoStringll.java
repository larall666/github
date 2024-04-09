public class DemoStringll {
  public static void main(String[] args) {
    String s ="hello";
    String s2 = "";
    String s3 = " ";
    String s4 = "    ";

    //boolean isEmptyresult = s2.isEmpty();
    //System.out.println(isEmptyresult);
    System.out.println(s2.isEmpty());
    System.out.println(s3.isEmpty());
    System.out.println(s4.isBlank());

    //substring()
    String result = s.substring(0,3);
    System.out.println(result);
    result = s.substring(2);
    System.out.println(result);

        // toLowerCase()
        System.out.println("HELlo".toLowerCase()); // hello
        
        // toUpperCase()
        System.out.println("HELlo".toUpperCase()); // HELLO
        System.out.println(s.toUpperCase()); // HELLO

    //contains
    System.out.println(s.contains("a"));
    System.out.println(s.contains("ll"));

    //starswith()
    System.out.println(s.startsWith("he"));
//endsWith
System.out.println(s.endsWith("llo"));

//replace()
String after = s.replace("l", "z");
System.out.println(after);


//trim() remove the space at the beginning and the tall of the string
String s5 = "    hello   !  world";
System.out.println(s5.trim()); //"hello   !  world" 
System.out.println(s5.replace(" ", "")); //remove all spaces

//indexOf
char c = s.charAt(2); // 'l'
System.out.println(s.indexOf('l')); // 2 -> the index of the first matching character
System.out.println(s.indexOf('a')); // -1
System.out.println(s.lastIndexOf('l'));//3 -> the index of last matching character
System.out.println(s.indexOf('he'));//
  }
}
