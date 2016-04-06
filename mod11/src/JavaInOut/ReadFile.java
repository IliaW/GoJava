package JavaInOut;

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
        reader.close();
        return builder.toString();
    }
}
