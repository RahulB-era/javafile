// WAP to demonstrate the concept of interface when two interfaces have common data menber and unique method
// First interface
interface Interface1 {
    int data = 10; // Common data member

    void method1(); // Unique method
}

// Second interface
interface Interface2 {
    int data = 20; // Common data member

    void method2(); // Unique method
}

// Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method1 implementation");
    }

    public void method2() {
        System.out.println("Method2 implementation");
    }
}

public class Q16 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
        System.out.println("Data from Interface1: " + Interface1.data);
        System.out.println("Data from Interface2: " + Interface2.data);
    }
}
