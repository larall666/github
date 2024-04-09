public class DemoSwitch {
  public static void main(String[] args) {
    char grade = 'D';
    switch (grade){
      case 'A':
      System.out.println("This is grade A");
      break;
      case 'B':
      System.out.println("This is grade B");
      break;
      case 'C':
      System.out.println("This is grade C");
      break;
      default:
      System.out.println("Default Value");
    }
    int score = 0;
    switch (grade) {
      case 'A':
       score++;
       case 'B':
       score++;
       case 'C':
       score++;
       case 'D':
       score++;
       case 'E':
       score++;
       default:
    } 
    System.out.println("score="+score);
    {
      
    }


  }
}
