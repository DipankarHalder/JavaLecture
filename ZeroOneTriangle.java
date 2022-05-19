import java.util.*;

public class ZeroOneTriangle {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    // 0-1 Triangle
    System.out.println("0-1 Triangle -");
    for (int row = 1; row <= processInput; row++) {
      for (int col = 1; col <= row; col++) {
        int sum = row + col;
        if (sum % 2 == 0) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
}
