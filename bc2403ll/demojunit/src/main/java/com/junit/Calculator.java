package com.junit;

import java.util.List;

/**
 * Hello world!
 */
public class Calculator {
   
    public static String concat(List<String>strings){
        StringBuilder sb = new StringBuilder();
    for (String s : strings) {
      sb.append(s);
    }
    return sb.toString();
  }

        public static int sum(int x, int y){
            return x+y;
        }

        public static int subtract(int x, int y){
            return x-y;
        }

        public static void sort(int[] arr){
            int temp = 0;
            for(int i = 0; i<arr.length-1;i++){
                for(int j = 0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        temp=arr[j+1];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                
            }
        }
        public static void main(String[] args) {
            //System.out.println(sb.toString);
        }
    }


