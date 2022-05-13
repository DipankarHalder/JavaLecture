import java.util.*;

public class PatternNumber {
  public static void main(String[] args) {
    Scanner userInputRowLength = new Scanner(System.in);
    int rowLength = userInputRowLength.nextInt();

    // Half Number Pyramid
    System.out.println("Half Number Pyramid -");
    for (int row = 1; row <= rowLength; row++) {
      for (int col = 1; col <= row; col++){
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
