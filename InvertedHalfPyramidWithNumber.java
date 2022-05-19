import java.util.*;

public class InvertedHalfPyramidWithNumber {
  public static void main(String[] args) {
    Scanner userInputNumLength = new Scanner(System.in);
    int rowLength = userInputNumLength.nextInt();

    // Invert Half Pyramid
    System.out.println("Invert Half Pyramid with Number -");
    for (int row = 1; row <= rowLength; row++) {
      for (int spaceItm = 1; spaceItm <= rowLength - row + 1; spaceItm++) {
        System.out.print(spaceItm);
      }
      System.out.println();
    }
  }
}
