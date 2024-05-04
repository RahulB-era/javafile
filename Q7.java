// WAP to demonstrate use of method overloading to calculate area of square, rectangle and triangle

public class Q7{

    static int area(int a){
        return a*a;
    }
    static int area(int a, int b){
        return a*b;
    }
    static float area(float a, float  b){
        return a*b;
    }

    public static void main(String [] args){
        System.out.println("Area of Square: ");
        System.out.println(area(5));
        System.out.println("Area of Rectangle: ");
        System.out.println(area(5, 10));
        System.out.println("Area of Triangle: ");
        System.out.println(area(5.0f, 10.0f));

    }
}