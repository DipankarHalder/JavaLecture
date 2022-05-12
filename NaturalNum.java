import java.util.*;

public class NaturalNum {
  public static void main(String[] args) {
    Scanner inputNum = new Scanner(System.in);
    int userNum = inputNum.nextInt();
    int sum = 0;

    for (int i = 1; i <= userNum; i++) {
      sum = sum + i;
    }
    
    System.out.println("Natural No : " + sum);
  }
}
