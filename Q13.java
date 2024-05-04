//WAP to use super () to invoke base class constructor.

//The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).
class Superclass {
    String message = "This is the superclass";

    Superclass() {
        System.out.println("Superclass constructor called");
    }

    void display() {
        System.out.println("Display method in superclass");
    }
}

class Subclass extends Superclass {
    String message = "This is the subclass";

    Subclass() {
        //Use of super() to access superclass constructor
        super(); 
        System.out.println("Subclass constructor called");
    }

    void display() {
        // Access Overridden Methods of the superclass
        super.display(); 
        System.out.println("Display method in subclass");
    }

    void printMessage() {
        //Access Attributes of the Superclass
        System.out.println(super.message); 

        System.out.println(this.message); // Access attribute of subclass
    }
}

public class Q13 {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display(); // Calls Subclass's display
        obj.printMessage(); // Prints messages from both classes
    }
}
