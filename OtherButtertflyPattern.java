import java.util.*;

public class OtherButtertflyPattern {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    // Other Buttertfly Pattern
    System.out.println("Other Buttertfly Pattern -");
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
    for (int row = processInput - 1; row >= 1; row--) {
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
