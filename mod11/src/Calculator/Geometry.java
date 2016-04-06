package Calculator;

/**
 * Создать класс, вычисляющий площадь простых геометрических фигур:
 * треугольника, прямоугольника и круга.
 */

public class Geometry {

    public double triangle(double length, double height) {
        return ((length * height) / 2);
    }

    public double rectangle(double length, double width) {
        return (length * width);
    }

    public double circle(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}
