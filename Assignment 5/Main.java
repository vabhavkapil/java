import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int run;
        do{
            System.out.println("MENU\n====");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            // switch case
            switch(choice){
                case 1:
                    // creating object for each class
                    Circle c = new Circle();
                    // method from abstract class Shape
                    c.stateShape("Circle");
                    // overwrite method specific to class object
                    c.calculateArea();
                    c.calculatePerimeter();
                    break;
                case 2:
                    Square s = new Square();
                    s.stateShape("Square");
                    s.calculateArea();
                    s.calculatePerimeter();
                    break;
                case 3:
                    Rectangle r = new Rectangle();
                    r.stateShape("Rectangle");
                    r.calculateArea();
                    r.calculatePerimeter();
                    break;
                case 4:
                    Sphere sp = new Sphere();
                    sp.stateShape("Sphere");
                    sp.calculateArea();
                    sp.calculatePerimeter();
                    // using interface Volume
                    sp.calculateVolume();
                    break;
                case 5:
                    Cylinder cy = new Cylinder();
                    cy.stateShape("Cylinder");
                    cy.calculateArea();
                    cy.calculatePerimeter();
                    cy.calculateVolume();
                    break;
                case 6:
                    Pyramid p = new Pyramid();
                    p.stateShape("Pyramid");
                    p.calculateArea();
                    p.calculatePerimeter();
                    p.calculateVolume();
                    break;
                default:
                    System.out.println("Wrong input.");
            }
            System.out.print("Run again? Yes-1, No-0: ");
            run = sc.nextInt();
        }while(run==1);
    }
}