package HomeWorkExep_61.HomeWork5.ArraySorting;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Ex {
    public static void main(String[] args) {
        // Вводим довжину масиву
        try {
            System.out.println("Введіть довжину масива");
            int num = new Scanner(System.in).nextInt();
            int[] array = new int[num];

            // Заповнюємо масив рандомними значеннями
            for (int i = 0; i < num; i++) {
                array[i] = (int) (Math.random() * 4);
            }
            System.out.println("Заданий масив       " + Arrays.toString(array));

            // Реалізуємо сортування вставкою
            for (int k = 1; k < array.length; k++) {
                for (int j = k; j > 0 && array[j - 1] > array[j]; j--) {
                    int value = 0;
                    value = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = value;
                }
            }
            System.out.println("Відсортований масив " + Arrays.toString(array));
        }catch (InputMismatchException e){
            System.out.println("Невірний формат вводу");
        }
        }
}