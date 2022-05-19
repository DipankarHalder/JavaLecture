import java.util.*;

public class FloydTriangle {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    int incNum = 1;

    // Floyd's Triangle
    System.out.println("Floyd's Triangle -");
    for (int row = 1; row <= processInput; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(incNum + " ");
        incNum++;
      }
      System.out.println();
    }
  }
}
