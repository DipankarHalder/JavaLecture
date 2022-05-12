import java.util.*;

public class Equality {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num_one = sc.nextInt();
    int num_two = sc.nextInt();

    // check if number is equal or not
    if (num_one == num_two) {
      System.out.println("Both are equal : " + num_one + " == " + num_two);
    } else {
      if (num_one > num_two) {
        System.out.println("First no - Greater & Second no - Smaller : " + num_one + " > " + num_two);
      } else {
        System.err.println("First no - Smaller & Second no - Greater : " + num_one + " < " + num_two);
      }
    }
  }
}
