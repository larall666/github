package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  int x=0;
  int y=0;

  @BeforeAll
  static void initialize(){
    System.out.println("SolutionTest: initialize");
  }

  @BeforeEach
  void set(){
    this.x =100;
    System.out.println("SolutionTest: set up");
  }

  @AfterAll
  static void initialize2(){
    System.out.println("SolutionTest: initialize2");
  }

  @AfterEach
  void set2(){
    this.y =100;
    System.out.println("SolutionTest: set up2");
  }

  @Test 
  void  testX(){
    this.x++;
    this.y++;
    assertEquals(101, this.x);
    assertEquals(1, this.y);
  }
}
