package Calculator.Tests;

import Calculator.Temperature;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TemperatureTest {

    private Temperature temperature;

    @Before
    public void setTemperature() throws Exception {
        temperature = new Temperature();
    }

    @Test
    public void fInC_50F_10CReturn() throws Exception {
        final double result = temperature.fInC(50);

        Assert.assertEquals(10, (int) result);
    }

    @Test
    public void cInF_10F_50CReturn() throws Exception {
        final double result = temperature.cInF(10);

        Assert.assertEquals(50, (int) result);
    }
}
