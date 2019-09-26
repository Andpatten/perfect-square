package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void isPerfectSquare() {
    assertTrue(Square.isPerfectSquare(0));
    assertTrue(Square.isPerfectSquare(1));
    assertTrue(Square.isPerfectSquare(9));
    assertTrue(Square.isPerfectSquare(144));
    assertFalse(Square.isPerfectSquare(3));
    assertFalse(Square.isPerfectSquare(8));
    assertFalse(Square.isPerfectSquare(91));
    assertFalse(Square.isPerfectSquare(24));
  }
    @Test
   void isException() {
    try {
      Square.isPerfectSquare(-1);
      fail();
    } catch (IllegalArgumentException expected) {
      //Do nothing; this is exactly as expected.
    }
   }

}