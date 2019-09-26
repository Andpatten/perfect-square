package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
    assertThrows(IllegalArgumentException.class, new ExecuteIsPerfectSquare());
   }

   private static class ExecuteIsPerfectSquare implements Executable {

     @Override
     public void execute() throws Throwable {
       Square.isPerfectSquare(-1);
     }
   }
}