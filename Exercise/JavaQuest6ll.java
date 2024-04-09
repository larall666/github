package questions;

public class JavaQuest6ll {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int n = 16;
    int [] Fibonacci = new int[n];
    Fibonacci[0] = 0;
    Fibonacci[1] = 1;

    for (int i = 2; i < n; i++) {
      Fibonacci[i] = Fibonacci[i-1]+Fibonacci[i-2];
    }
    for (int i = 0; i < n; i++){
        System.out.print(Fibonacci[i] + " ");
  }
  System.out.println(" ");
  int sum = 0;
  int[] integers = new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
  for (int i = 0; i < integers.length; i++) {
    sum += integers[i];
    System.out.println("The sum is " + sum);
  }


    System.out.println("The sum is " + sum);
}
  
}