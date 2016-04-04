package CaesarCipher;

import java.util.ArrayList;
import java.util.List;

public class Caesar {

    private List<Character> alphabet = new ArrayList<>();

    Caesar() {
        for (char c = ' '; c <= '~'; c++) {
            alphabet.add(c);
        }
    }

    public String encode(String text,int key) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int index = alphabet.indexOf(text.charAt(i));
            index = (index + key) % alphabet.size();
            builder.append(alphabet.get(index));
        }
        return builder.toString();
    }

    public String decrypt(String text, int key) {
       return encode(text,-key);
    }
}