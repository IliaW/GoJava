import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            ScanRandomSort scanRandomSort = new ScanRandomSort();
            System.out.println("Enter the length of the array");
            scanRandomSort.scanAndRandom();
            System.out.println("The specified array: " + Arrays.toString(scanRandomSort.array));
            System.out.println("Sorted array:        " + Arrays.toString(scanRandomSort.sorting(scanRandomSort.array)));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format");
        }
    }
}