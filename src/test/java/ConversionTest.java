import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhenya on 28.11.15.
 */
public class ConversionTest {

    Conversion cn = new Conversion();

    @Test
    public void testConversionIntegerToBinaryString() {
        Conversion cn = new Conversion();

        assertEquals("1000", cn.conversionIntegerToBinaryString(8));
        assertEquals("1", cn.conversionIntegerToBinaryString(1));
        assertEquals("0", cn.conversionIntegerToBinaryString(0));
        assertEquals("100", cn.conversionIntegerToBinaryString(4));
        assertEquals("111", cn.conversionIntegerToBinaryString(7));
        assertEquals("1111", cn.conversionIntegerToBinaryString(15));

    }

    @Test
    public void testConversionStringToBinaryInteger() {
        assertEquals(1, cn.conversionStringToBinaryInteger("1"));
        assertEquals(100, cn.conversionStringToBinaryInteger("4"));
        assertEquals(1000, cn.conversionStringToBinaryInteger("8"));
        assertEquals(1111, cn.conversionStringToBinaryInteger("15"));
        assertEquals(111, cn.conversionStringToBinaryInteger("7"));

    }
}
