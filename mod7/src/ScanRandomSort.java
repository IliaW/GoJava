import java.util.Scanner;

public class ScanRandomSort {
    public int[] array;

    public int[] scanAndRandom() {

        // Введення з клавіатури довжини масиву
        int num = new Scanner(System.in).nextInt();
        array = new int[num];

        // Заповнення масива рандомними значеннями
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }
        return array;
    }

    // Реалізуємо сортування вставкою
    public int[] sorting(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            for (int j = k; j > 0 && arr[j - 1] > arr[j]; j--) {
                swap(j);
            }
        }
        return arr;
    }

    //Зміна місцями двох значень
    public int[] swap(int j) {
        int value;
        value = array[j - 1];
        array[j - 1] = array[j];
        array[j] = value;
        return array;
    }
}