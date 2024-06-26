package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SupermanTest {
  
  @Spy
  private Cat cat;

  @InjectMocks
  private Superman superman;

  @Test

  void testSum(){
    // Mockito.when(cat.sum(8, 10)).thenReturn(6);
    // assertEquals(99, superman.sum(8));
    // verify(cat, times(1)).sum(8,10);
    Mockito.when(cat.sum(98, 10)).thenReturn(1);
    assertEquals(50, superman.sum(98));  //sum = int x 
    verify(cat, times(1)).sum(98,10);
  }

    @Test

    void testSum2(){
      // Mockito.when(cat.sum(9, 10)).thenReturn(5);
      // assertEquals(50, superman.sum(9));
      // verify(cat, times(1)).sum(9,10);
       Mockito.when(cat.sum(94, 10)).thenReturn(0);
      assertEquals(99, superman.sum(94));
      verify(cat, times(1)).sum(94,10);
  }
}
