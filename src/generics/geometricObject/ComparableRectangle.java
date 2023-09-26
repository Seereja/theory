package generics.geometricObject;

import org.jetbrains.annotations.NotNull;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(@NotNull ComparableRectangle anotherRectangle) {

        int result;
        result = (int) (anotherRectangle.getArea() - this.getArea());
        return result;

    }

    @Override // Реализует метод toString в GeometricObject
    public String toString() {
        return "Ширина: " + getWidth() + " Высота: " + getHeight() +
                " Площадь: " + getArea();
    }


}
