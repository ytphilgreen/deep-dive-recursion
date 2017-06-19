package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Fibonacci {
  
  public static void main(String[]args){
    
  }
public static BigInteger fib (int n){
  if (n <= 0){
    return BigInteger.ZERO;
  }
  if (n == 1) {
    return BigInteger.ONE;
  }
  return fib(n -1).add(fib(n-2));
}

}
