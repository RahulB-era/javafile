// WAP to demonstrate run-time polymorphism.

// Method overriding is an example of runtime polymorphism. In method overriding, a subclass overrides a method with the same signature as that of in its superclass.

class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}
class Dog extends Animal {
    //Function overriding (run time polymorphism)
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}
public class TestDog {
   public static void main(String args[]) {
      Animal a = new Animal(); 
      Animal b = new Dog();
      a.move(); 
      b.move(); 
   }
}