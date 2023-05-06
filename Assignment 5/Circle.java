import java.util.Scanner;
public class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    private double r;
    Circle(){
        // user enters radius
        System.out.print("Enter the radius: ");
        this.r = sc.nextDouble();
    }
    @Override
    public void calculateArea(){
        // area of circle formula
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("The Area of the circle is: %.2f\n", area);
    }
    @Override
    public void calculatePerimeter() {
        double circ = 2 * Math.PI * r;
        System.out.printf("The Circumference of the circle is: %.2f\n", circ);
    }
}