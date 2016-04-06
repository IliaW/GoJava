package Caesar.Tests;

import Caesar.Caesar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaesarTests {

    private Caesar caesar;

    @Before
    public void setCaesar() throws Exception {
        caesar = new Caesar();
    }

    @Test
    public void encode___text_ABC_abc_123_Key3___DEF_def_456_Return() throws Exception {
        final String result1 = caesar.encode("abc", 3);
        Assert.assertEquals("def", result1);

        final String result2 = caesar.encode("ABC", 3);
        Assert.assertEquals("DEF", result2);

        final String result3 = caesar.encode("123", 3);
        Assert.assertEquals("456", result3);
    }

    @Test
    public void decrypt___text_DEF_Def_456_Key3___ABC_abc_123_Return() throws Exception {
        final String result1 = caesar.decrypt("def", 3);
        Assert.assertEquals("abc", result1);

        final String result2 = caesar.decrypt("DEF", 3);
        Assert.assertEquals("ABC", result2);

        final String result3 = caesar.decrypt("456", 3);
        Assert.assertEquals("abc", result3);
    }
}