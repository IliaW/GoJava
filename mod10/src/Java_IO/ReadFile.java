package Java_IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public String readFile(String name) throws IOException {
        FileReader reader = new FileReader(name + ".txt");
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            builder.append((char) c);
        }
        return builder.toString();
    }
}
