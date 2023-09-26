package generics.geometricObject;

public class Circle extends GeometricObject {


    private double radius;

    public Circle() {

    }

    public Circle(double radius, boolean filled, String color) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void getCircle() {
        System.out.println("Круг создан " + getDateCreated() + " Радиус равен " + getRadius());
    }


}
