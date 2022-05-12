import java.util.*;

public class OddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    // check if number is odd or even
    if(num % 2 == 0) {
      System.out.println("Your entered number " + num + " - Even");
    } else {
      System.out.println("Your entered number " + num + " - Odd");
    }
  }
}
