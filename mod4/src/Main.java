import java.util.Scanner;

/**
 Создать класс, вычисляющий площадь простых геометрических фигур:
 треугольника, прямоугольника и круга.

 Создать класс преобразующий значение температуры по шкале Цельсия
 в значение по шкале Фаренгейта и в обратном направлении.

 Создать класс вычисляющий расстояние между двумя точками, представленными
 координатами в двумерном пространстве (x1, y1), (x2, y2).
 */

public class Main {
    public static void main(String[] args) {

        Geometry geometry = new Geometry();
        Temperature temperature = new Temperature();
        Coordinates coordinates = new Coordinates();

        System.out.println("Введіть номер необхідної дії " + "\n" +
                " 1. Розрахунок площі " + "\n" +
                " 2. Перетворення температур " + "\n" +
                " 3. Відстань між двома точками");
        Scanner num = new Scanner(System.in);
        int numMenu = num.nextInt();
        switch (numMenu) {
            case 1: {
                System.out.println(" 1. Розрахунок площі трикутника " + "\n" +
                        " 2. Розрахунок площі прямокутника " + "\n" +
                        " 3. Розрахунок площі круга");
                int numGeometry = num.nextInt();
                switch (numGeometry) {
                    case 1: {
                        System.out.println("Введіть довжину основи трикутника");
                        double length = num.nextDouble();
                        System.out.println("Введіть висоту трикутника");
                        double height = num.nextDouble();
                        System.out.println(geometry.triangle(length,height));
                        break;
                    }
                    case 2: {
                        System.out.println("Введіть довжину прямокутника");
                        double length = num.nextDouble();
                        System.out.println("Введіть ширину прямокутника");
                        double width = num.nextDouble();
                        System.out.println(geometry.rectangle(length,width));
                        break;
                    }
                    case 3: {
                        System.out.println("Введіть радіус кола");
                        double radius = num.nextDouble();
                        System.out.println(geometry.circle(radius));
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println(" 1. Перетворити Фаренгейти в Цельсії " + "\n" +
                        " 2. Перетворити Цельсії в Фаренгейти ");
                int numTemperature = num.nextInt();
                switch (numTemperature) {
                    case 1: {
                        System.out.println("Введіть температуру по Фаренгейту");
                        double tempInFahrenheit = num.nextDouble();
                        System.out.println(temperature.fInC(tempInFahrenheit));
                        break;
                    }
                    case 2: {
                        System.out.println("Введіть температуру по Цельсію");
                        double tempInCelsius = num.nextDouble();
                        System.out.println(temperature.cInF(tempInCelsius));
                        break;
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Введіть X1");
                double x1 = num.nextDouble();
                System.out.println("Введіть Y1");
                double y1 = num.nextDouble();
                System.out.println("Введіть X2");
                double x2 = num.nextDouble();
                System.out.println("Введіть Y2");
                double y2 = num.nextDouble();
                System.out.println(coordinates.distance(x1,y1,x2,y2));
                break;
            }
        }
    }
}


