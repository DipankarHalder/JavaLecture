import java.util.*;

public class ButtertflyPattern {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    // Buttertfly Pattern
    System.out.println("Buttertfly Pattern -");
    for (int row = 1; row <= processInput; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      for (int col = 1; col <= (processInput - row) * 2; col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int row = processInput; row >= 1; row--) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      for (int col = 1; col <= (processInput - row) * 2; col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
