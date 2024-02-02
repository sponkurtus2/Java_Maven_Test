package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void ShouldAdd() {
    assertEquals(10, Calculator.add(5, 5));
  }

  @Test
  public void ShouldMinus() {
    assertEquals(0, Calculator.minus(5, 5));
  }
}
