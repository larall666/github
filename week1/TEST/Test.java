package week1.Test;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {

  int a = 10;
  int b = 3 * a % 3;
  if (a == 9) {
    System.out.println("a is equals to 9");
  } else if (a < 9 && a >= 0) {
    System.out.println("a is between 0 and 8");
    
  } else if (a < 0){
    System.out.println("a < 0");
  } else{
    System.out.println("a > 9");

  }
  String str = "I love Java. I love coding";
  if ((str.length() == 27)) { // code here. Fix the bug.
    System.out.println("str length=27");
  } else if ((str.length() < 27)) { // code here ... add the condition
    System.out.println("str length < 27");
  } else if ((str.length() > 27)) { // code here ... complete the code
    System.out.println("str length > 27");
  }
  int year1 = 2009;
    // Program a condition to check if it is a leap year.
    // But should NOT print anything.
    if (year1 % 4 == 0) { // code here ...
      System.out.println("2009 is a leap year.");
    }
    int year2 = 2020;
    // same as the above, but it will print out.
    if (year2 % 4 == 0) { // code here ...
      System.out.println("2020 is a leap year.");
    }
    int year3 = 2400;
    if (year3 % 4 == 0) { // code here ...
      System.out.println("2400 is a leap year.");
    // code here ... same as the above, but it will print out.
    int year5 = 2100;
    if ((year5 % 4 == 0) && (year5 % 100 == 0) && (year5 % 400 == 0)){ // code here ...
      System.out.println("2100 is a leap year.");
    // code here ...same as the above, but it will NOT print out.
  }
      Scanner input = new Scanner(System.in); 

    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

  // Complete the switch statement
  switch (month) {
    case 1:
    MonthOfName = "January";
       number_Of_DaysInMonth = 31;// Code here ...
      break;
    case 2:
    MonthOfName = "February";
      // The February has 29 days: (Every 4 years and the year cannot divded by 100)
      // or The year can divided by 400
      // otherwise the February should have 28 days only
      // how about other months, December?
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
      number_Of_DaysInMonth = 29;
      else
      number_Of_DaysInMonth = 28;
      break;
      case 3:
    MonthOfName = "March";
       number_Of_DaysInMonth = 31;
      break;
      case 4:
    MonthOfName = "April";
       number_Of_DaysInMonth = 30;
      break;
      case 5:
    MonthOfName = "May";
       number_Of_DaysInMonth = 31;
      break;
      case 6:
    MonthOfName = "June";
       number_Of_DaysInMonth = 30;
      break;
      case 7:
    MonthOfName = "August";
       number_Of_DaysInMonth = 31;
      break;
      case 8:
    MonthOfName = "September";
       number_Of_DaysInMonth = 31;
      break;
      case 9:
    MonthOfName = "April";
       number_Of_DaysInMonth = 30;
      break;
      case 10:
    MonthOfName = "October";
       number_Of_DaysInMonth = 31;
      break;
      case 11:
    MonthOfName = "November";
       number_Of_DaysInMonth = 30;
      break;
      case 12:
    MonthOfName = "December";
       number_Of_DaysInMonth = 31;
      break;
  }
  System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
}

  }
}
