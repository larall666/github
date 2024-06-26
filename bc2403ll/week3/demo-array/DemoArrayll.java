import java.util.Arrays;

public class DemoArrayll {
  public static void main(String[] args) {

    // Arrwy (S)
    // int[]arr = new int [3];

    // long [] arr2 = new long [10];

    String[] strings = new String[3]; // String array object
    strings[0] = "hello";
    strings[1] = "hello";
    strings[2] = "hello";

    String[] strings2 = new String[] {"hello1", "hello1", "hello1"};

    for (int i = 0; i < strings2.length; i++) {
      System.out.println(strings2[i]);
    }


    // Example 1
    int[] integers2 = new int[] {1, 2, 3, 4, 5, 6, 7};
    // loop: print odd number

    // Find the max value within the int array
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < integers2.length; i++) {
      if (integers2[i] > max) {
        max = integers2[i];
      }
    }
    System.out.println("max=" + max);



    // Find the min value within the int array
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < integers2.length; i++) {
      if (integers2[i] < min) {
        min = integers2[i];
      }
    }
    System.out.println("min=" + min); // 1

    // Sharching
    char[] characters = new char[] {'a', 'b', 'e', '!'};
    // check if the array contains char '!' to true / false
    boolean result = false;
    // break
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == '!') {
        result = true;
        break;
      }
    }
    System.out.println("Sharching= " + result);


    // print out the first index of '!', if not found, print -1.
    int index = -1;
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == '!') {
        index = i;
        break;
      }
    }
    System.out.println(index);

    // Store all index of '!' in another array
    char[] characters2 = new char[] {'a', 'b', '!', 'e', '!'};
    int[] indexs = new int[characters2.length];
    int j = 0;
    for (int i = 0; i < characters2.length; i++) {
      if (characters2[i] == '!') {

        indexs[j] = i;
        j++;
      }
    }
    System.out.println(Arrays.toString(indexs));

    //
    String[] balls = new String[] {"RED", "YELLOW", "BLACK", "YELLOW"};
    double[] prices = new double[] {5.5, 7.8, 10.0, 7.8};
    int[] quantities = new int[] {1, 3, 4, 5};
    // find the total amount of yellow balls (price * quantity)
    double amount = 0.0;
    for (int i = 0; i < balls.length; i++) {
      if ("YELLOW".equals(balls[i])) {
        amount += prices[i] * quantities[i];
      }
    }
    System.out.println(amount);

    // Swapping
    int[] arr3 = new int[] {10, 3, 9, 4};
    int temp = arr3[0];
    arr3[0] = arr3[2];
    arr3[2] = temp;
    System.out.println(Arrays.toString(arr3)); // 9, 3, 10, 4

    // int[] arr4 = new int[] {9, 3, 10, 4};
    // int temp1 = arr4[0];
    // arr4[0] = arr4[3];
    // arr4[3] = arr4[0];
    // arr4[2] = arr4[3];
    // arr4[3] = temp1;

    int t = -1;
    for (int i = 0; i < arr3.length - 1; i++) {
      t = arr3[i];
      arr3[i] = arr3[i + 1];
      arr3[i + 1] = t;
    }
    System.out.println(Arrays.toString(arr3));// 3,10,4,9

    // Move the max value to the heas of the array
    // int[] arr5 = new int[] {3, 10, 4, 9};
    int max1 = Integer.MIN_VALUE;
    int idx = -1;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max1) {
        max1 = arr3[i];
        idx = i;
      }
    }
    // idx -> 1
    for (int i = idx; i > 0; i--) {
      t = arr3[i];
      arr3[i] = arr3[i - 1];
      arr3[i - 1] = t;
    }
    System.out.println(Arrays.toString(arr3));// 10, 3, 4, 9

    byte value = 127;
    for (int i = 0; i < 10; i++) {
      value++;
    }
    System.out.println("value: " + value);

    // Sorting
    int[] arr4 = new int[] {-10, -42, 8, 19, 1};
    for (int i = 0; i < arr4.length - 1; i++) {
      for (int k = 0; k < arr4.length - i - 1; k++) {
        if (arr4[k] > arr4[k + 1]) {
          int temp2 = arr4[k];
          arr4[k] = arr4[k + 1];
          arr4[k + 1] = temp2;
        }
      }
    }
    for (int i = 0; i < arr4.length; i++) {
      System.out.print(arr4[i] + " ");
    }
    System.out.println(" ");
    int[] arr6 = new int[] {4, 3, 2, 10, 12, 1, 5, 6};
    for (int i = 1; i < arr6.length; i++) {
      int key = arr6[i];
      int b = i - 1;

      while (b >= 0 && arr6[b] > key) {
        arr6[b + 1] = arr6[b];
        b--;
      }

      arr6[b + 1] = key;
    }
    for (int i = 0; i < arr6.length; i++) {
      System.out.print(arr6[i] + " ");
    }

    //Sorting - Insertion sort
    System.out.println(" ");
    int[] arr5 = new int[] {-10, -5, -30, 9, 1, -100};
    for (int i = 1; i < arr5.length; i++) {
      int key = arr5[i];
      int c;
      for ( c = i - 1; c >= 0; c--) {
        if (arr5[c] > key) {
          arr5[c + 1] = arr5[c];
        }else
        break;
      }
      arr5[c + 1] = key;
    }
    System.out.print(Arrays.toString(arr5));
//or
System.out.println(" ");
    int[] arr7 = new int[] {-10, -5, -30, 9, 1, -100};
    for (int i = 1; i < arr7.length; i++) {
      int key = arr7[i];
      int c;
      for ( c = i - 1; c >= 0; c--) {
        if (arr7[c] <= key) {
          break;
        }
          arr7[c + 1] = arr7[c];
      }
      arr7[c + 1] = key;
    }
    System.out.print(Arrays.toString(arr7));

    //Sorting - Selection Sort
  }

}

