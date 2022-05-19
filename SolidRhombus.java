import java.util.*;

public class SolidRhombus {
  public static void main(String[] arr) {
    Scanner userInput = new Scanner(System.in);
    int processInput = userInput.nextInt();

    // Solid Rhombus
    System.out.println("Solid Rhombus -");
    for (int row = 1; row <= processInput; row++) {
      for (int col = 1; col <= processInput - row; col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= processInput; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
