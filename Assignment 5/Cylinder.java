import java.util.Scanner;
public class Cylinder extends Shape implements Volume {
    Scanner sc = new Scanner(System.in);
    // defining private variables for radius and height
    private double r, h;
    Cylinder(){
        // user enters radius and height
        System.out.print("Enter the radius: ");
        this.r = sc.nextDouble();
        System.out.print("Enter the height: ");
        this.h = sc.nextDouble();
    }
    @Override
    public void calculateArea() {
        // surface area of cylinder
        double area = 2 * Math.PI * r * (r+h);
        System.out.printf("The Surface Area of the cylinder is: %.2f\n", area);
    }
    @Override
    public void calculatePerimeter() {
        // cylinder has two edges: circumference of two circles
        double per = 4 * Math.PI * r;
        System.out.printf("The Total Length of Edges of the cylinder is: %.2f\n", per);
    }
    @Override
    public void calculateVolume() {
        // volume formula for cylinder
        double vol = Math.PI * Math.pow(r, 2) * h;
        System.out.printf("The Volume of the cylinder is: %.2f\n", vol);
    }
}
