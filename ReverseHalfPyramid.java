import java.util.*;

public class ReverseHalfPyramid {
  public static void main(String[] args) {
    Scanner userInputRowLength = new Scanner(System.in);
    int rowLength = userInputRowLength.nextInt();

    // Reverse Half Pyramid
    System.out.println("Reverse Half Pyramid -");
    for (int row = rowLength; row >= 1; row--) {
      for (int col = 1; col <= row; col++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
