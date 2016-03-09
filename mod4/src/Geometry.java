/**
 Создать класс, вычисляющий площадь простых геометрических фигур:
 треугольника, прямоугольника и круга.
 */

public class Geometry {

    double triangle(double a, double h){

        return ((a*h)/2);
    }
    double rectangle(double a, double b){

        return (a*b);
    }
    double circle (double r){

        return (3.14*r*r);
    }
}
