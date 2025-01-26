package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
  }
  @Test
  public void testNaivePower() {
    App classUnderTest = new App();
    assertEquals(1, classUnderTest.naivePower(2, 0), "2^0 should be 1");
    assertEquals(2, classUnderTest.naivePower(2, 1), "2^1 should be 2");
    assertEquals(4, classUnderTest.naivePower(2, 2), "2^2 should be 4");
    assertEquals(8, classUnderTest.naivePower(2, 3), "2^3 should be 8");
    assertEquals(1024, classUnderTest.naivePower(2, 10), "2^10 should be 1024");
  }

  @Test
  public void testUnoptimizedDCPower() {
    App classUnderTest = new App();
    assertEquals(1, classUnderTest.unoptimizedDCPower(2, 0), "2^0 should be 1");
    assertEquals(2, classUnderTest.unoptimizedDCPower(2, 1), "2^1 should be 2");
    assertEquals(4, classUnderTest.unoptimizedDCPower(2, 2), "2^2 should be 4");
    assertEquals(8, classUnderTest.unoptimizedDCPower(2, 3), "2^3 should be 8");
    assertEquals(1024, classUnderTest.unoptimizedDCPower(2, 10), "2^10 should be 1024");
  }

  @Test
  public void testOptimizedDCPower() {
    App classUnderTest = new App();
    assertEquals(1, classUnderTest.optimizedDCPower(2, 0), "2^0 should be 1");
    assertEquals(2, classUnderTest.optimizedDCPower(2, 1), "2^1 should be 2");
    assertEquals(4, classUnderTest.optimizedDCPower(2, 2), "2^2 should be 4");
    assertEquals(8, classUnderTest.optimizedDCPower(2, 3), "2^3 should be 8");
    assertEquals(1024, classUnderTest.optimizedDCPower(2, 10), "2^10 should be 1024");
  }
}
