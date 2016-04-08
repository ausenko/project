import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Anton on 08.04.16.
 */
public class TestDnaStrand {

    @Test
    public void testMakeComplement(){

        assertEquals("TTT", DnaStrand.makeComplement("AAA"));
        assertEquals("AT", DnaStrand.makeComplement("TA"));
        assertEquals("CC", DnaStrand.makeComplement("GG"));
        assertEquals("CTAG", DnaStrand.makeComplement("GATC"));


    }
}
