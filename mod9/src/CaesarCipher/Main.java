package CaesarCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Encoding the text
        Scanner scanner = new Scanner(System.in);
        Caesar caesar = new Caesar();
        System.out.println("Enter the text you want to decrypt");
        String inputText = scanner.nextLine();
        System.out.println("Enter the key");
        int inputKey = scanner.nextInt();
        String outText = caesar.encode(inputText, inputKey);
        System.out.println("\nCiphertext:\n" + outText);

        // Decoding the text
        System.out.println("\nEnter the key to decrypt");
        int key = scanner.nextInt();
        String decryptText = caesar.decrypt(outText, key);
        if (inputText.equals(decryptText))
            System.out.println(decryptText);
        else
            System.out.println("Incorrect key");
    }
}
