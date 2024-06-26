package com.example;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  @Test
  void testString() {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "hello";

    // Junit 5
    // Assertions.assertEquals(s1, s2);
    assertEquals(s1, s2);

    // Hamcrest
    assertThat(s1, is(equalTo(s2)));
  }

    @Test
    void testList(){
      List<String> strings=new ArrayList<>(List.of("apple","banana"));
      List<String> strings2= Arrays.asList("apple","banana");
     
      assertThat(strings,hasSize(2));
  }

  @Test
  void testArray(){
    String[] arr= new String[]{"hello","abc"};
    assertThat(arr,arrayContaining("hello","abc"));
    assertThat(arr,not(arrayContaining("abc","hello")));

    assertThat(arr,arrayContainingInAnyOrder("abc","hello"));
    assertThat(arr,arrayContainingInAnyOrder("hello","abc"));
   
  }

  @Test
  void testTolerance(){
    double tolerance =0.1d;
    double actual = 3.14159d;
    assertThat(actual, closeTo(3.111,tolerance));
    assertThat(actual, not(closeTo(3.039,tolerance)));
  }

  @Test
  void testInstanceOf(){
    Number number = Long.valueOf(13);
    assertThat(number, is(instanceOf(Long.class)));
    assertThat(number, is(instanceOf(Long.class)));
  }
}

