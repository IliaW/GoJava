package SearchValue;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть довжину масива");
        int num = new Scanner(System.in).nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Введіть " + (i + 1) + " число масива");
            int in = new Scanner(System.in).nextInt();
            array[i] = in;
        }
        System.out.println("Заданий масив " + Arrays.toString(array));
        SearchValue search = new SearchValue();
        System.out.println("Мінімальне число: " + search.min(array));
        System.out.println("Максимальне число: " + search.max(array));
    }
}