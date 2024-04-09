import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        System.out.print(i + " ");
      }

    }

    System.out.println("");

    String s = "123456789";
    String result = "";
    for (int i = 0; i < s.length(); i++)
      if (i % 2 == 1) {
        result += s.charAt(i);
      }
    System.out.println(result + " R");

    int max = 10;
    int min = 1;
    int k = 0;
    for (int i = min; i <= max; i++) {
      k += i;
    }
    System.out.println("k="+k);

    k = 0;
    for (int i = min; i <= max; i++) {
      if (i % 2 == 0) {
        k += i;
        System.out.print(k + " ");
      }
    }
    System.out.println("");
    int k2 = 0;
    for (int i = min; i <= max; i++) {
      if (i % 2 == 0) {
        k2 -= i;
      } else {
        k2 += i;
      }
    }
    System.out.println("k2=" + k2);

    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("i=" + i + ",j=" + j);
  }
}

int[] integers2 = new int[] {1, 2, 3, 4, 5, 6, 7};
// loop: print odd numbers
for (int i = 0; i < integers2.length; i++) {
  if (integers2[i] % 2 == 1) {
    System.out.print(integers2[i]+" ");
  }
}


System.out.println("");
    int[] arr3 = new int[] {9,3,10,4};
    int t = -1;
    for (int i = 0; i < arr3.length - 1; i++) {
      t = arr3[i];
      arr3[i] = arr3[i + 1];
      arr3[i + 1] = t;
    }
    System.out.println(Arrays.toString(arr3));

    int[] arr4 = new int[] {-10, -42, 8, 19, 1};

    for (int i = 0; i < arr4.length - 1; i++) { // 0,1,2,3,4
      for (int c = 0; c < arr4.length - i - 1; c++) {
        if (arr4[c] > arr4[c + 1]) {
          t = arr4[c];
          arr4[c] = arr4[c + 1];
          arr4[c + 1] = t;
        }
      }
    }
    System.out.println(Arrays.toString(arr4));

int A=24;
int B=7;
int C=(byte) (A*B);
System.out.println(C);

String str = "";
for (byte i =127;i<128;i++){
  str +=i;
  if (i<0){
    break;
  }
}
System.out.println(str);

String str2 = "";
//for (byte i =127;i<128;i++){
 // if (i<0){
    //continue;
 // }
  //str2 +=i;

 // }

//System.out.println(str);

int g=3;
System.out.println("g="+ ++g*8);

System.out.println("hello");
      Car c = new Car();
      c.setColor("RED");
      c.setspeed(80.0d);
      c.setcapacity(5);
      System.out.println("color="+ c.getColor());
      System.out.println("speed="+ c.getspeed());
      System.out.println("capacity="+ c.setcapacity());
      System.out.println(c.toString());

      String str3 = "Welcome to programming";
      String newStr = str3.replace("WELCOME TO", "");
      char N= newStr.trim().charAt(2);
      System.out.println(N);

      // String s = "hello";
      // String newStr1 = "";
      // if (s.length()>5||s.indexOf("he")==1){
      //   newStr = s;
      // } else {
      //   newStr1 += "str5";
      // }
      // System.out.println(newStr1);

int []integers = { 20, 10, 40};
byte [] bytes = new byte [] {2,4,1};
int score =0;
for (int i=0;i<3;i++){
  if (i%2==1){
    score +=integers[i];
  }else{
    score += bytes[i];
  }
}
System.out.println("score"+score);

// String [] strings3= new String [3];
// String sum = "";
// for (int i = 0; i<4; i++) {
//   strings3[i]=String.valueOf(i);
//   sum += strings3[i];
// }
// System.out.println(sum);

int a = 0;
while (a<3){
  switch (a){
    case 0 :
    System.out.print("0");
    case2:
    System.out.print("2");
  }
  a++;
}


}
}
//A A 3D4D B D7CBC A
