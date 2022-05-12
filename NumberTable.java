import java.util.*;

public class NumberTable {
  public static void main(String[] args) {
    Scanner userNum = new Scanner(System.in);
    int userInput = userNum.nextInt();

    System.out.println("Table of " + userInput);
    for (int i = 1; i <= 10; i++) {
      System.out.println(userInput + " x " + i + " = " + (i * userInput));
    }
  }
}
