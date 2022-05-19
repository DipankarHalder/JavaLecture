import java.util.*;

public class PalindromicPattern {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    // Palindromic Pattern
    System.out.println("Palindromic Pattern -");
    for (int row = 1; row <= processInput; row++) {
      for (int col = 1; col <= processInput - row; col++) {
        System.out.print(" ");
      }
      for (int col = row; col >= 1; col--) {
        System.out.print(col);
      }
      for (int col = 2; col <= row; col++) {
        System.out.print(col);
      }
      System.out.println();
    }
  }
}
