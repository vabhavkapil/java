// creating an abstract class
abstract public class Shape {
    // predefined method common for all classes
    public void stateShape(String shape){
        System.out.println("The shape is: "+shape);
    }
    // abstract method to be overwritten
    abstract public void calculateArea();
    abstract public void calculatePerimeter();
}
