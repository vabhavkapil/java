import java.util.Scanner;
public class Sphere extends Shape implements Volume {
    Scanner sc = new Scanner(System.in);
    // defining a private variable
    // common radius for area and volume
    private double r;
    Sphere(){
        // user enters radius
        System.out.print("Enter the radius: ");
        this.r = sc.nextDouble();
    }
    @Override
    public void calculateArea() {
        // surface area of sphere
        double area = 4 * Math.PI * Math.pow(this.r, 2);
        System.out.printf("The Surface Area of the sphere is: %.2f\n", area);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("A sphere has no edges!");
    }
    @Override
    public void calculateVolume() {
        // volume formula for sphere
        double vol = (4 * Math.PI * Math.pow(this.r, 3)) / 3;
        System.out.printf("The Volume of the sphere is: %.2f\n", vol);
    }
}