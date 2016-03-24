import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            ScanRandomSort scanRandomSort = new ScanRandomSort();
            System.out.println("Введіть довжину масива");
            scanRandomSort.scanAndRandom();
            System.out.println("Заданий масив       " + Arrays.toString(scanRandomSort.array));
            System.out.println("Відсортований масив " + Arrays.toString(scanRandomSort.sorting(scanRandomSort.array)));
        } catch (InputMismatchException e) {
            System.out.println("Невірний формат вводу");
        }
    }
}