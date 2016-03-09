/**
 Создать класс преобразующий значение температуры по шкале Цельсия
 в значение по шкале Фаренгейта и в обратном направлении.
 */

public class Temperature {

    double fInC(double a){

        return ((a-32)*(5/9));
    }
    double cInF(double a){

        return ((a*9/5)+32);
    }
}
