package CaesarCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Encoding the text
        Caesar caesar = new Caesar();
        String text = new Scanner(System.in).nextLine();
        caesar.encode(text);
        System.out.printf(text);
    }
}
