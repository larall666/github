package questions;

public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output:
   * We found 3 character c in the String.
   * 
   * When target = 'z', the expected output:
   * Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // Use a loop to count the target of character in a String.
    // code here ...

    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here ...

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
      }
    }
    System.out.println("We found " + count + " character c in the String.");
    count=0;
    //System.out.println(count);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'z') {
        count++;
      }
    }
    if (count == 0){
    System.out.println("Not Found");}

  }
}