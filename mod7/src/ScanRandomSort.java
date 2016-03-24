import java.util.Scanner;

public class ScanRandomSort {
    int[] array;

    public int[] scanAndRandom() {

        // Keyboard input array length
        int num = new Scanner(System.in).nextInt();
        array = new int[num];

        // Filling an array of random values
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }
        return array;
    }

    // Realize sorting insert
    public int[] sorting(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            for (int j = k; j > 0 && arr[j - 1] > arr[j]; j--) {
                swap(j);
            }
        }
        return arr;
    }

    // Replacement seats two values
    private int[] swap(int j) {
        int value;
        value = array[j - 1];
        array[j - 1] = array[j];
        array[j] = value;
        return array;
    }
}