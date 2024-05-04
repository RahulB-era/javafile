// WAP declaring a class Rectangle with data member’s length and breadth and member functions Input, Output and CalcArea.

class Rectangle{
    int l,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    void Output(){
        System.out.println("the length and bredth of the reactangle is "+l+" "+b);
    }
    int CalcArea(){
        return l*b;
    }
};

public class Q4{
public static void main(String []args){
    Rectangle rect = new Rectangle(2,3);
    rect.Output();
int area = rect.CalcArea();
        System.out.println("Area of the rectangle is: " + area);
}
}
