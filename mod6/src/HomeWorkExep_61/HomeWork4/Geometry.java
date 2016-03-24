package HomeWorkExep_61.HomeWork4;

public class Geometry {
    double triangle(double length, double height) throws NumberFormatException {
        if (length <= 0 || height <= 0) {
            throw new NumberFormatException("A side may not be equal to or less than zero");
        }
        return ((length * height) / 2);
    }

    double rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new NumberFormatException("A side may not be equal to or less than zero");
        }
        return (length * width);
    }

    double circle(double radius) {
        if (radius <= 0) {
            throw new NumberFormatException("Radius may not be equal to or less than zero");
        }
        return (Math.PI * Math.pow(radius, 2));
    }
}
