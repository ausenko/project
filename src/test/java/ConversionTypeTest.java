import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Аnton on 03.12.15.
 */
public class ConversionTypeTest {
    ConversionType cn = new ConversionType();

    @Test
    public void testConversionTypeToString() {
        assertEquals("1", cn.conversionTypeToString(1));
        assertEquals("100", cn.conversionTypeToString(4));
        assertEquals("1000", cn.conversionTypeToString(8));
        assertEquals("1111", cn.conversionTypeToString(15));
        assertEquals("111", cn.conversionTypeToString(7));
    }


    @Test
    public void testConversionTypeToInteger() {
        assertEquals(1, cn.conversionTypeToInteger("1"));
        assertEquals(100, cn.conversionTypeToInteger("4"));
        assertEquals(1000, cn.conversionTypeToInteger("8"));
        assertEquals(1111, cn.conversionTypeToInteger("15"));
        assertEquals(111, cn.conversionTypeToInteger("7"));
    }

}
