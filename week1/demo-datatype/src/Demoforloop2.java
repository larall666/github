public class Demoforloop2 {
  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      System.out.println("*");
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("i=" + i + ",j=" + j);
      }
      break;

      int n = 3;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - 1 ; j++) {
        System.out.print("*");
        }
        System.out.println();
      }

      //Search
      String str2 = "abc hello world!";
      //find the index of the second of space charactrt, if exists, print the index, if no, print N/A
      int spaceCount = 0;
      for (int i = 0; i < str2.length(); i++) {
        if (str2.charAt(i) == ' ') {
          if (++spaceCount == 2) {
            System.out.println("index=" + i);
            break;
          }
        }
        if (spaceCount < 2){
          System.out.println("N/A");
        }
      }
       break;
      for (int i =0; i < 5; i++) {
        if (i > 3) {
          break;
        }
        System.out.println("hello");
      }

       //continue;
      for (int i = 0; i < 10; i++) {
        if (i > 3) {
          continue;
          

        }


        }
        System.out.println("hello");
            }



          }
  }
  
