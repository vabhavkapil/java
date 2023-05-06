import java.util.Scanner;
public class Square extends Shape {
    Scanner sc = new Scanner(System.in);
    private double l;
    Square(){
        // user enters side length
        System.out.print("Enter the side length: ");
        this.l = sc.nextDouble();
    }
    @Override
    public void calculateArea(){
        // area of square formula
        double area = Math.pow(l, 2);
        System.out.printf("The Area of the square is: %.2f\n", area);
    }
    @Override
    public void calculatePerimeter() {
        // perimeter of square formula
        double per = 4*l;
        System.out.printf("The Perimeter of the square is: %.2f\n", per);
    }
}