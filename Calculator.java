import java.util.*;

public class Calculator {
  public static void main(String[] args) {
    Scanner userNum = new Scanner(System.in);
    int num_one = userNum.nextInt();
    int num_two = userNum.nextInt();
    int action_performe = userNum.nextInt();

    if(action_performe == 1) {
      System.out.println("Result (Sum) : " + (num_one + num_two));
    } else if (action_performe == 2) {
      System.out.println("Result (Sub) : " + (num_one - num_two));
    } else if(action_performe == 3) {
      System.out.println("Result (Mult) : " + (num_one * num_two));
    } else if(action_performe == 4) {
      System.out.println("Result (Div) : " + (num_one / num_two));
    } else {
      System.out.println("Sorry :( Bad Input");
    }

  }
}
