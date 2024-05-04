//WAP to demonstrate multi-level and hierarchical inheritance.

//Multilevel Inheritance: A subclass inherits from a superclass, and another subclass inherits from this subclass, forming a chain of inheritance.
//Hierarchical Inheritance: Multiple subclasses inherit from a single superclass, creating a hierarchy of classes.
// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown in color");
    }
}

// Another derived class inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Q12{
    public static void main(String[] args) {
        // Creating objects
        Labrador labrador = new Labrador();
        Cat cat = new Cat();

        // Demonstrating multi-level inheritance
        labrador.eat(); // Inherited from Animal
        labrador.bark(); // Inherited from Dog
        labrador.color(); // Specific to Labrador

        System.out.println();

        // Demonstrating hierarchical inheritance
        cat.eat(); // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}
