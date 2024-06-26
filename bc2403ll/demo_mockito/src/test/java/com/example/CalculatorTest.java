package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
  
  @Mock
  private Cat mockedcat;

  @Test 
  void testCalculatorSum(){
   Mockito.when(this.mockedcat.sum(8,10)).thenReturn(100);

   Calculator calculator = new Calculator(8,mockedcat);
   int result = calculator.sum();
   
   assertEquals(103, result);
  
   Cat cat = new Cat();
    assertEquals(-10,cat.sum(-1,-9));
    int result2 = cat.sum(10,10);
    assertEquals(20, result2);
   verify(this.mockedcat, times(1)).sum(8,10);
  }
}
