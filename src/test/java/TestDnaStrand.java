import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

/**
 * Created by Anton on 07.04.16.
 */
public class TestDnaStrand {

    @Test
    public void testMakeComplement(){

        assertEquals("TTTT",DnaStrand.makeComplement("AAAA"));
        assertEquals("A",DnaStrand.makeComplement("T"));
        assertEquals("",DnaStrand.makeComplement(""));
        assertEquals("G",DnaStrand.makeComplement("C"));
        assertEquals("C",DnaStrand.makeComplement("G"));
        assertEquals("GGCCAATT",DnaStrand.makeComplement("CCGGTTAA"));

    }

    @Test
    public void testComplementSecond(){

        assertEquals("TTTT",DnaStrand.makeComplementSecond("AAAA"));
        assertEquals("A",DnaStrand.makeComplementSecond("T"));
        assertEquals("",DnaStrand.makeComplementSecond(""));
        assertEquals("G",DnaStrand.makeComplementSecond("C"));
        assertEquals("C",DnaStrand.makeComplementSecond("G"));
        assertEquals("GGCCAATT",DnaStrand.makeComplementSecond("CCGGTTAA"));

    }
}
