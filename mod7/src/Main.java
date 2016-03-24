import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            ScanRandomSort a = new ScanRandomSort();
            System.out.println("Введіть довжину масива");
            a.scanAndRandom();
            System.out.println("Заданий масив       " + Arrays.toString(a.array));
            System.out.println("Відсортований масив " + Arrays.toString(a.sorting(a.array)));
        } catch (InputMismatchException e) {
            System.out.println("Невірний формат вводу");
        }
    }
}