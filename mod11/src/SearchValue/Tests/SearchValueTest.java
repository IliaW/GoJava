package SearchValue.Tests;

import SearchValue.SearchValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchValueTest {

    private static SearchValue search;
    private static int[] array;

    @BeforeClass
    public static void setSearchClass() throws Exception {
        array = new int[]{5, -3, 1, -2, 4};
        search = new SearchValue();
    }

    @Test(timeout = 1000)
    public void search_Minimum_InTheArray_minus3Return() throws Exception {
        final int minNum = search.min(array);

        Assert.assertEquals(-3, minNum);
    }

    @Test(timeout = 1000)
    public void search_Maximum_InTheArray_5Return() throws Exception {
        final int maxNum = search.max(array);

        Assert.assertEquals(5, maxNum);
    }
}