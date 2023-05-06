import java.util.Scanner;
public class Rectangle extends Shape {
    Scanner sc = new Scanner(System.in);
    private double l, h;
    Rectangle(){
        // user enters length and height
        System.out.print("Enter the length: ");
        this.l = sc.nextDouble();
        System.out.print("Enter the height: ");
        this.h = sc.nextDouble();
    }
    @Override
    public void calculateArea(){
        // area of rectangle formula
        double area = l * h;
        System.out.printf("The Area of the rectangle is: %.2f\n", area);
    }
    @Override
    public void calculatePerimeter() {
        // perimeter of rectangle formula
        double per = 2*(l+h);
        System.out.printf("The Perimeter of the rectangle is: %.2f\n", per);
    }
}