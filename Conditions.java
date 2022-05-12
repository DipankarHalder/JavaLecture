// Conditional Statements

// if statement
// if else statement
// if else if statement
// switch statement
// break statement

import java.util.*;

public class Conditions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    // if statement
    if(age > 18) {
      System.out.println("You are eligible to vote : " + age);
    } else {
      System.out.println("You are not eligible to vote : " + age);
    }
  }
}
