package Calculator;

/**
 Создать класс вычисляющий расстояние между двумя точками, представленными
 координатами в двумерном пространстве (x1, y1), (x2, y2).
 */

public class Coordinates {
    public double distance(double x1, double y1, double x2, double y2){
        return (Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }
}
