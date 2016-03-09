/**
 Создать класс преобразующий значение температуры по шкале Цельсия
 в значение по шкале Фаренгейта и в обратном направлении.
 */

public class Temperature {
    double fInC(double temperatureF){
        return ((temperatureF-32)*(5/9));
    }
    double cInF(double temperatureC){
        return ((temperatureC*9/5)+32);
    }
}
