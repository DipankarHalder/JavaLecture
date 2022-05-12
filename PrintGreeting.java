import java.util.*;

public class PrintGreeting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int optionName = sc.nextInt();

    // if statement to print the greeting
    // if(optionName == 1) {
    //   System.out.println("Hello, World!");
    // } else if(optionName == 2) {
    //   System.out.println("Namaste, World!");
    // } else if(optionName == 3) {
    //   System.out.println("Bonjour, World!");
    // } else {
    //   System.out.println("Sorry! :( Bad input.");
    // }

    // switch statement to print the greeting
    switch(optionName) {
      case 1:
        System.out.println("Hello, World!");
        break;
      case 2:
        System.out.println("Namaste, World!");
        break;
      case 3:
        System.out.println("Bonjour, World!");
        break;
      default:
        System.out.println("Sorry! :( Bad input.");
    }
  }
}
