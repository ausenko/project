import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Anton
 * on 30.11.15.
 */
public class ConversionTypeTest {
    ConversionType cn = new ConversionType();

    @Test
    public void testConversionTypeToInt() {
        assertEquals(1, cn.conversionTypeTOint("1"));
        assertEquals(100, cn.conversionTypeTOint("4"));
        assertEquals(1000, cn.conversionTypeTOint("8"));
        assertEquals(1111, cn.conversionTypeTOint("15"));
        assertEquals(111, cn.conversionTypeTOint("7"));
    }

    @Test
    public void testConversionTypeToString() {
        assertEquals("1", cn.conversionTypeToString(1));
        assertEquals("100", cn.conversionTypeToString(4));
        assertEquals("1000", cn.conversionTypeToString(8));
        assertEquals("1111", cn.conversionTypeToString(15));
        assertEquals("111", cn.conversionTypeToString(7));
    }


}
