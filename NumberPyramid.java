import java.util.*;

public class NumberPyramid {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    // Number Pyramid
    System.out.println("Number Pyramid -");
    for (int row = 1; row <= processInput; row++) {
      for (int col = 1; col <= processInput - row; col++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print(row + " ");
      }
      System.out.println();
    }
  }
}
