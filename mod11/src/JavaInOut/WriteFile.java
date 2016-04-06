package JavaInOut;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public String writeFile(String text, String name) throws IOException {
        FileWriter writer = new FileWriter(name + ".txt");
        writer.write(text);
        writer.flush();
        writer.close();
        return text;
    }
}