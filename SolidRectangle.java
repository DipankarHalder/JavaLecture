import java.util.*;

public class SolidRectangle {
  public static void main(String[] args) {
    Scanner userInputRowLength = new Scanner(System.in);
    int rowLength = userInputRowLength.nextInt();
    int colLength = userInputRowLength.nextInt();

    // solid rectangle
    System.out.println("Solid Rectangle -");
    for (int row = 1; row <= rowLength; row++) {
      for (int col = 1; col <= colLength; col++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
