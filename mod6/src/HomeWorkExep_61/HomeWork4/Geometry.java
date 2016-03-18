package HomeWorkExep_61.HomeWork4;

public class Geometry {
    double triangle(double length, double height){
        return ((length*height)/2);
    }
    double rectangle(double length, double width){
        return (length*width);
    }
    double circle (double radius){
        return (Math.PI*Math.pow(radius,2));
    }
}
