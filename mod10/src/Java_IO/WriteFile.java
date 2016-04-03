package Java_IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public WriteFile(String text, String name) throws IOException {
        FileWriter writer = new FileWriter(name + ".txt");
        writer.write(text);
        writer.flush();
    }
}
