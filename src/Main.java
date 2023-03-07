public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(5, 10);

        AreaCalculator circleAreaCalculator = new AreaCalculator();
        AreaCalculator rectangleAreaCalculator = new AreaCalculator();
        AreaCalculator totalAreaCalculator = new AreaCalculator();

        circle.accept(circleAreaCalculator);
        rectangle.accept(rectangleAreaCalculator);
        circle.accept(totalAreaCalculator);
        rectangle.accept(totalAreaCalculator);

        System.out.println("Circle area: " + circleAreaCalculator.getArea());
        System.out.println("Rectangle area: " + rectangleAreaCalculator.getArea());
        System.out.println("Total area: " + totalAreaCalculator.getArea());
    }
}
