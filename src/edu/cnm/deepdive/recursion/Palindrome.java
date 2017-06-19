package edu.cnm.deepdive.recursion;

public class Palindrome {

  public static void main(String[] args) {
   String rawString = args[0].toLowerCase();
   String scrubString = rawString.replaceAll("[^a-z0-9]", ""); 

  }
public static boolean isPalindrome(String input) {
  if (input.length() <=1) {
    return true;
  }
  if (input.charAt(0) != input.charAt(input.length()-1)) {
    return false;
  }
return isPalindrome (input.substring (1, input.length() -1));

}
}
