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
public class Superman2Test {
  
  @Spy
  private Cat cat;

  @InjectMocks
  private Superman superman;

  @Test

  void testSum(){
    // Mockito.when(cat.sum(8, 10)).thenReturn(6);
    // assertEquals(99, superman.sum(8));
    // verify(cat, times(1)).sum(8,10);
    Mockito.when(cat.sum(98, 10)).thenReturn(2);
    Mockito.when(cat.subtract(100, 98)).thenReturn(3);
    assertEquals(50, superman.sum(98));
    verify(cat, times(1)).sum(98,10);
    verify(cat, times(1)).subtract(100, 98);
  }

    @Test

    void testSum2(){
      // Mockito.when(cat.sum(9, 10)).thenReturn(5);
      // assertEquals(50, superman.sum(9));
      // verify(cat, times(1)).sum(9,10);
      Mockito.when(cat.sum(98, 10)).thenReturn(3);
      Mockito.when(cat.subtract(100, 98)).thenReturn(3);
      assertEquals(99, superman.sum(98));
      verify(cat, times(1)).sum(98,10);
      verify(cat, times(1)).subtract(100, 98);
  
}
}
