//WAP to demonstrate the use of static variable, static method and static block.

public class Q10 {
// The static variable is a class level variable and it is common to all the class objects i.e. a single copy of the static variable is shared among all the class objects.
   static int x = 10;
   static int y;
// A static method manipulates the static variables in a class. It belongs to the class instead of the class objects and can be invoked without using a class object.
   static void func(int z) {
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      System.out.println("z = " + z);
   }
// The static initialization blocks can only initialize the static instance variables. These blocks are only executed once when the class is loaded.
   static {
      System.out.println("Running static initialization block.");
      y = x + 5;
   }
   public static void main(String args[]) {
      func(8);
   }
}

