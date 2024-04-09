public class DemoWrapper {
  public static void main(String[] args) {
    int x =1;//+,-,*,/,%
    Integer x2 = 1;
    Integer x3 = new Integer("1");

    if (x2.equals(1)) {
      System.out.println("x2=1");
    }
if (x2==1){
  System.out.println("x2=1");
}
x2 = 128;
if(x2 ==128){
  System.out.println("x=128");
}
Integer num1 = Integer.valueOf(127);
Integer num2 = Integer.valueOf(127);
System.out.println(num1==num2); //true
System.out.println(num1.equals(num2));//true

Integer num5 = new Integer("127");
System.out.println("k=" + num1.equals(num5));

Integer num3 = Integer.valueOf(128);
Integer num4 = Integer.valueOf(128);
System.out.println(num3==num4); //false?
System.out.println("G=" + num3.equals(num4));//true

String str = "hello";
String str2 = "hello";

String str3 = new String("hello");
String str4 = String.valueOf("hello");

System.out.println(str==str2);//true
System.out.println(str==str3);//false
System.out.println(str==str4);//true
System.out.println(str.equals(str2));//true
System.out.println(str.equals(str3));//true

Double d2 = 1.0;
Double d3 = 1.0;
Double d4 = Double.valueOf(1.0);

System.out.println(d2==d3);//false
System.out.println(d2==d4);//false
System.out.println(d2.equals(d3));//true
System.out.println(d2.equals(d4));//true
System.out.println(d2.compareTo(d3));//0
System.out.println(d2.compareTo(d4));//0
System.out.println(d3.compareTo(d4));//0
//17 Types + array
Integer i1 =3;
int i2 = i1;

Character c2 = 'c';
char c3 = c2;

Integer i3 = 10;
long l4 =i3;
//short s4 = i3; can't


  }
}
