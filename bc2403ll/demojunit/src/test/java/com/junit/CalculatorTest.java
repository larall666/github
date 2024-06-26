package com.junit;

//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*; //static import
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculatorTest {
  @Test
  void testSum() {
//int actual = Calculator.sum(3,4);
// Assertions.assertEquals(7, actual);
// Assertions.assertEquals(-10, Calculator.sum(-1,-9));
// Assertions.assertEquals(-1, Calculator.subtract(0,0));

//  Assertions.assertNotEquals(8, Calculator.sum(3,4));
 //Assertions.assertEquals(7, Calculator.sum(3,4));
//assertEquals(7, actual);
assertEquals(-10, Calculator.sum(-1,-9));
assertEquals(0, Calculator.sum(0,0));

assertNotEquals(8, Calculator.sum(3,4));
assertEquals(0, Calculator.subtract(2,2));
assertEquals(0, Dog.div(2,3));
  }

  @Test
  void testSubtract() {

// Assertions.assertEquals(8, Calculator.subtract(-1,-9));
// Assertions.assertEquals(8, Calculator.subtract(10,2));
// Assertions.assertEquals(0, Calculator.subtract(2,2));
assertEquals(8, Calculator.subtract(-1,-9));
assertEquals(8, Calculator.subtract(10,2));
assertEquals(0, Calculator.subtract(2,2));
assertNotEquals(8, Calculator.sum(3,4));

 
  }

  // @Test

  // void testSort(){
  //   int[] arr=new int[]{2,4,3,1};
  //   Calculator.sort(arr);
  //  // Assertions.assertArrayEquals(new int[] {1,2,3,4},arr);
  //  assertArrayEquals(new int[] {1,2,3,4},arr);
  // }

   @Test
  void testConcat() {
    assertEquals(new String("abcdefijk"), Calculator.concat(List.of("abc", "def", "ijk")));

  
    
    
  }

  @ParameterizedTest
  @CsvSource({
"2,1,1",
"100,60,40"
  })
  void testSumEqauls(int expected, int x,int y){
    assertEquals(expected, Calculator.sum(x,y));
  }

  @ParameterizedTest
  @CsvSource({
"2,3,1",
"100,61,40"
  })
  void testSumNotEqauls(int expected, int x,int y){
    assertNotEquals(expected, Calculator.sum(x,y));
  }

 @Test
 void testTimeOut(){
  assertTimeout(Duration.ofMillis(500),()->{
    String s="";
    for(int i=0;i<10000;i++){
      s+=i;
    }
    System.out.println("s="+s);
  });
 }
  
}
