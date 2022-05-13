import java.util.*;

public class HollowRectangle {
  public static void main(String[] args) {
    Scanner userInputRowLength = new Scanner(System.in);
    int rowLength = userInputRowLength.nextInt();
    int colLength = userInputRowLength.nextInt();

    // hollow rectangle
    System.out.println("Hollow Rectangle -");
    for (int row = 1; row <= rowLength; row++) {
      for (int col = 1; col <= colLength; col++){
        if(row == 1 || row == rowLength || col == 1 || col == colLength) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
