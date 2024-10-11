import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void printArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    public void printPerameter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perameter of Rectangle: " + perimeter);
    }
}
    class Square extends Rectangle {
    public Square(int side) {
        super(side, side); 
    }
}

public class p19 {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(4, 5);
        rectangles[1] = new Square(3);
        for (Rectangle rectangle : rectangles) {
            rectangle.printArea();
            rectangle.printPerameter();
        }
    }
}
