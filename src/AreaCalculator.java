public class AreaCalculator implements ShapeVisitor {
    private double area = 0.0;


    @Override
    public void visitCircle(Circle circle) {
        area += Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        area += rectangle.getLength() * rectangle.getWidth();
    }

    public double getArea() {
        return area;
    }
}
