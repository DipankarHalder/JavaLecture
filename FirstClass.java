// JRE => Java Runtime Environment
// JVM => Java Virtual Machine
// JDK => Java Development Kit
// Java is a Portable language, because you can convert it to byte code and run it in any system.
// Java is a typed language, because if you want to define any variable, then you need to add the type of variable.

// Data Types & Memory Size
  // Primitive => 
  //   1. int,        -> 4 byte
  //   2. double,     -> 8 byte
  //   3. float,      -> 4 byte
  //   4. long,       -> 8 byte
  //   5. short, 
  //   6. byte        -> 1 byte = 8 bits, 
  //   7. char,       -> 2 byte
  //   8. boolean,    -> 1 byte
  
  // Non-Primitive =>
  //   1. String,
  //   2. Array,
  //   3. Object,
  //   4. Interface,
  //   5. Class,

import java.util.*;

class FirstClass {

  public static void main(String[] args) {

    // take input from user
    Scanner sc = new Scanner(System.in); // create object of Scanner class
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Output : "+ (a + b));
  }
}