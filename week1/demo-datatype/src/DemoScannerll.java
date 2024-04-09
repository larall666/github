import java.util.Scanner;

public class DemoScannerll {
  public static void main(String[] args) {
    
    // Get User Input
    Scanner s = new Scanner (System.in);
    System.out.println("Please input a number:");
    int input = s.nextInt();

    System.out.println("input=" + input);

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input1 = new Scanner(System.in);
    

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input1.nextInt();

    System.out.print("Input the value: ");
    int newValue = input1.nextInt();
  }
}
