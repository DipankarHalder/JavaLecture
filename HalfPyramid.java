import java.util.*;

public class HalfPyramid {
  public static void main(String[] args) {
    Scanner userInputRowLength = new Scanner(System.in);
    int rowLength = userInputRowLength.nextInt();

    // Half Pyramid
    System.out.println("Half Pyramid -");
    for (int row = 1; row <= rowLength; row++) {
      for (int col = 1; col <= row; col++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
