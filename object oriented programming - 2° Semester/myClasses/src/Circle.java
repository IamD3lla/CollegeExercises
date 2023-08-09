public class Circle {

    //Class attribute
    private double radius;

    //Constant PI defined as final static
    final static double PI = 3.141592653589793;

    //Constructor method
    public Circle(double radius) {
        this.radius = radius;
    }

    //Method to calculate the circumference of the circle
    public double calculatesPerimeter() {
        return 2 * PI * this.radius;
    }

    //Main method
    public static void main(String[] args) {

        //Creates the instance of a circle with a radius 5
        Circle myCircle = new Circle(5);

        //Calculates and prints the perimeter
        double perimeter = myCircle.calculatesPerimeter();
        System.out.println("The perimeter of the circle is: " + perimeter);

    }

}
