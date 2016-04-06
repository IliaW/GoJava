package Calculator;

/**
 Создать класс преобразующий значение температуры по шкале Цельсия
 в значение по шкале Фаренгейта и в обратном направлении.
 */

public class Temperature {

    public final double CONST_32 = 32;
    public final double CONST_5 = 5;
    public final double CONST_9 = 9;

    public double fInC(double tempInFahrenheit){
        return ((tempInFahrenheit-CONST_32)*(CONST_5/CONST_9));
    }
    public double cInF(double tempInCelsius){
        return ((tempInCelsius*CONST_9/CONST_5)+CONST_32);
    }
}
