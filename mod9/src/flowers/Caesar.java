package flowers;

import java.util.ArrayList;
import java.util.List;

public class Caesar {

    List<Character> alphabet = new ArrayList<>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-', ' '};

    Caesar() {
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
    }

    String encode(String text,int key) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int index = alphabet.indexOf(text.charAt(i));
            index = (index + key) % alphabet.size();
            builder.append(alphabet.get(index));
        }
        return builder.toString();
    }

    String decrypt(String text, int key) {
        StringBuilder decryptText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int index = alphabet.indexOf(text.charAt(i));
            index = (index - key) % alphabet.size();
            decryptText.append(alphabet.get(index));
        }
        return decryptText.toString();
    }
}