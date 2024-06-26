public class demomethodll {

  public static void main(String[] args) {

    // call method
  int   result = sum(1, 3);
   int  result2 = sum(2, 5);

   double ans =  sum(1.3, 1.4);
    System.out.println(sum("1", "3"));// 4

// readiu->circle area
double area = area(3.2d);
double area2 = area("Circle", 3.2d);
double area3 = area("Square", 3.2d);
double area4 = calculate("Circle","area" 3.2d);
double area5 = calculate("Square","area" 3.2d);
double perimeter1 = calculate("Circle","perimeter" 3.2d);
double perimeter2 = calculate("Circle","perimeter" 3.2d);

double pi = Math.PI;//3.14159...

// Adult
int age =18;
if (age >=18){

}
boolean isAdult = isAdult(age);


  }
  // static method
  // "sum" is a method name
  // "(int x, int y)" is declaration of input parameters for method

  public static int sum(int x, int y) {
    int z = x + y;
    return z;
  }

  // subtraction
  public static int subtraction(int x, int y) {
    int z = x - y;
    return z;
    // or
   // return x - y;// int value-int value->int value
  }

  // Method Definition:method name + Input parameter
  public static double sum(double x, double y) {
    return x + y;
  }

  public static int sum(String x, String y) {
    Integer z = Integer.valueOf(x) + Integer.valueOf(y);// convert Strong to integer
    return z;// unboox

  }

  public static double area(double radius){
    return radius * radius * Math.PI;//bug
  }

  public static double area (String s, double x){
    //if (...) return different formule
    double area = -1.0;
    if("Circle".equals(s)){
      return x*x*Math.PI;
    }else if ("Square".equals(s)){
      return x*x;
    }
    return -1.0d;
  }

public static double calculate(String shape, String target,double x){
  if ("area".equals(target)){
if ("Circle".eq)
  }
}

public static boolean isAdult(int age){
  //approach 1
if (age>=18){
  return true;
}
return false;

//Approach 2:
// or return age>= 18? true : false;

//Approach 3:
//return age>-18;
}

}