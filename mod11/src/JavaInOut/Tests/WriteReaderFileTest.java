package JavaInOut.Tests;

import JavaInOut.Caesar;
import JavaInOut.ReadFile;
import JavaInOut.WriteFile;
import org.junit.Assert;
import org.junit.Test;

public class WriteReaderFileTest {

    @Test
    public void writeReaderFileTest() throws Exception {

        WriteFile writeFile = new WriteFile();
        ReadFile readFile = new ReadFile();
        Caesar caesar = new Caesar();

        //Write File
        String text = "Testing I/O 0123 !&;,.";
        String encodeText = caesar.encode(text, 15);
        String name = "Test";
        writeFile.writeFile(encodeText, name);

        Assert.assertTrue("ct#$x}v/X>^/?@AB/05J;=".equals(readFile.readFile(name)));

        //Decrypt File
        String decryptText = caesar.decrypt(readFile.readFile(name), 15);

        Assert.assertTrue(decryptText.equals(text));
    }
}
