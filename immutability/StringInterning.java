package immutability;

public class StringInterning {
  public static void main(String[] args) {
    // in this file we shall be demonstrating string interning concept in java
    // string interning is a process of storing the string in the string pool
    // the string pool is a memory area where all the string literals are stored
    // so when a string literal is created, the string is stored in the string pool
    // and the reference to the string is stored in the heap
    // Here's an example

    String str1 = "hello"; // str1 points to a string literal in the string pool
    String str2 = new String("hello"); // str2 points to a new string object in the heap
    String str3 = "hello".intern(); // str3 points to the same string literal as str1

    // Note that all strings by default are immutable, so they cannot be changed
    // later on in the program
    // meaning the intern() method is called by default when a string literal is
    // created

    System.out.println("Is str1 = str2? " + (str1 == str2)); // false - str1 and str2 refer to different objects
    System.out.println("Is str1 = str3? " + (str1 == str3)); // true - str1 and str3 refer to the same object in the
    // string pool

  }
}
