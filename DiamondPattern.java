import java.util.*;

public class DiamondPattern {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    // Diamond Pattern
    System.out.println("Diamond Pattern -");
    for (int row = 1; row <= processInput; row++) {
      for (int col = 1; col <= processInput - row; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= 2 * (row - 1); col++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int row = processInput; row >= 1; row--) {
      for (int col = 1; col <= processInput - row; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= 2 * (row - 1); col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
