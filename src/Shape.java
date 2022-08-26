public abstract class Shape {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5,2.3,3.5);
        Shape rectangle = new Rectangle(1, 2);
        Shape square = new Square(2.5);
        Shape circle = new Circle(3.5);
        System.out.println("The area of triangle: " + triangle.calculateArea());
        System.out.println("The perimeter of triangle: " + triangle.calculatePer());
        System.out.println("The area of rectangle: " + rectangle.calculateArea());
        System.out.println("The perimeter of rectangle: " + rectangle.calculateArea());
        System.out.println("The area of square: " + square.calculateArea());
        System.out.println("The perimeter of square: " + square.calculateArea());
        System.out.println("The area of circle: " + circle.calculateArea());
        System.out.println("The perimeter of circle: " + circle.calculateArea());
    }

    public abstract double calculateArea();

    public abstract double calculatePer();

}
