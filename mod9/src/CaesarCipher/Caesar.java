package CaesarCipher;

import java.util.ArrayList;
import java.util.List;

public class Caesar {

    List<Character> alphabet = new ArrayList<>();

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

    }
    public String encode(String text){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<=text.length();i++){
            int index = alphabet.indexOf(text.charAt(i));
            index =(index+3)%alphabet.size();
            builder.append(alphabet.get(index));
        }
        System.out.println(builder);
        return builder.toString();
    }

    public String decrypt(String text){
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            int index = alphabet.indexOf(letter);
            index -=3;
            newText.append(alphabet.get(index));
        }
        return newText.toString();
    }
}