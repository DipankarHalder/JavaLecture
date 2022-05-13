import java.util.*;

public class InvertedHalfPyramid {
  public static void main(String[] args) {
    Scanner userInputRowLength = new Scanner(System.in);
    int rowLength = userInputRowLength.nextInt();

    // Invert Half Pyramid
    System.out.println("Invert Half Pyramid -");
    for (int row = 1; row <= rowLength; row++) {
      for (int spaceItm = 1; spaceItm <= rowLength - row; spaceItm++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= row; col++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
