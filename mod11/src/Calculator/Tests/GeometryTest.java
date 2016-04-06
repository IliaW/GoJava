package Calculator.Tests;

import Calculator.Geometry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeometryTest {

    private Geometry geometry;

    @Before
    public void setTemperature() throws Exception {
        geometry = new Geometry();
    }

    @Test
    public void triangle_length10Height5_25Return() throws Exception {
        final double result = geometry.triangle(10, 5);

        Assert.assertEquals(25, (int) result);
    }

    @Test
    public void rectangle_length5Width4_20Return() throws Exception {
        final double result = geometry.triangle(5, 4);

        Assert.assertEquals(20, (int) result);
    }


}
