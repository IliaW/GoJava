package Java_IO;

import java.io.IOException;
import java.util.Scanner;

/*Реализовать сохранение/загрузку текстового сообщения
в файл с предварительным шифрованием/расшифрованием.
Предусмотреть обработку различных ошибок ввода/вывода.
*/

public class Main {

    public static void main(String[] args) {

        // Input text and name of file
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your message: ");
        String text = scanner.nextLine();
        System.out.print("Input name message: ");
        String name = scanner.nextLine();
        try {
            // Create and encode file
            Caesar caesar = new Caesar();
            String encodeText = caesar.encode(text);
            new WriteFile(encodeText, name);

            // Decrypt and read file
            System.out.println("Input key for decrypt message");
            int key = scanner.nextInt();
            ReadFile readFile = new ReadFile();
            System.out.println("Decrypt text; " + new Caesar().decrypt((readFile.readFile(name)), key));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}