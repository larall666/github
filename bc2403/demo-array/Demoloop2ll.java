public class Demoloop2ll {
  public static void main(String[] args) {
    int[] arr = new int[] {2, 10, 3, -1};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // for for-each
    for (int i : arr) {
      System.out.println(i);
    }
    String[] strings = new String[] {"abc", "def", "G"};
    for (String str : strings) {
      System.out.println(str);
    }

    //
    int count = 0;
    while (count < strings.length) {
      System.out.println(strings[count]);
      count++;
    }

    // infinite loop
    byte b = 0;
    while (b < 128) {
      // System.out.println(b);
      b++;
      if (b == 126) // add this line to avoid loop
        break;
    }
    System.out.println(b);

    int a = 1023;
    // Target:int arry [1,0,2,3]

    // int[] result = new int[aString.length()];

    int c = 1023 / 10;// 102
    int d = 1023 % 10;// 4
    int copy = a;
    count = 0;
    while (copy > 0) {
      break;// add this line
    }
    // do-while
    count = 0;
    do {
      if (count == 1) {
        break;
      }
      System.out.println("hello");
      count++;
    } while (count < 3);

  }

}
