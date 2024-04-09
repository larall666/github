public class App {
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 10;
        int max = 0;

        System.out.println("The max munber is " + max + ".");

        String day = "Sunday";
        if (day.equals("Sunday")){

        }else if (day.equals("Saturday"))

        System.out.println("Sunday is weekend.");

        int score = 85;
        char grade = ' ';
        if (score > 90) {
            grade= 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'F';
        }
        String examresult = "passed";
        if (grade == 'F') {
            examresult = "failed";
        }
        System.out.println("The grade is " + grade + " and " + examresult + ".");

        // String
        String s1 = "hello";
        // check if the length of s1 > 5
        if (s1.length()>5){
            System.out.println("s1.length() > 5");
        }

        // boolean (==, !=)
        int v = 4;
        boolean b1 = v > 10; // false
        if (b1 == true) {

        }if (b1 = false) {
        }if (!(b1 = true)) {
    }
    double u = 10.4;
    if (u >10 ) {
        System.out.println(u > 10);
    }
    //
}

}
