package com.junit;

public class StringChecker {
  public static boolean isPalindrome(String s){
    return new StringBuilder(s).reverse().toString().equals(s);
  }
}
