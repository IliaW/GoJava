package NewCaesarFromIlia;

import java.util.ArrayList;
import java.util.List;

public class Caesar {

    private List<Character> alphabet = new ArrayList<>();

    Caesar() {
        for (char c = ' '; c <= '~'; c++) {   // Loading all ASCII characters
            alphabet.add(c);
        }
    }

    public String encode(String text, int key) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int index = alphabet.indexOf(text.charAt(i)); // Search the library letter and extracting of her index
            index = (index + key + alphabet.size()) % alphabet.size(); // Encryption
            builder.append(alphabet.get(index));
        }
        return builder.toString();
    }

    public String decrypt(String text, int key) {
        return encode(text, -key);
    }
}