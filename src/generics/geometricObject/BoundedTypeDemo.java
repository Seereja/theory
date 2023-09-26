package generics.geometricObject;

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.setHeight(2);
        rectangle.setWidth(2);

        circle.setRadius(2);


        System.out.println(equalAria(rectangle, circle));
    }

    private static <E extends GeometricObject> boolean equalAria(E o1, E o2) {
        return o1.getArea() == o2.getArea();
    }
}
