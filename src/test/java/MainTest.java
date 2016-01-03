import org.junit.Test;
import junit.framework.*;

import java.io.File;

import static junit.framework.Assert.assertTrue;

/**
 * Created by zhenya on 02.01.16.
 */
public class MainTest {

    @Test
    public void testWriteToFile(){
        String filename = "Person.name";
        Person person = new Person("Aleksandr");
        assertTrue(new Main().writeToFile(person,filename));
        assertTrue(new File(filename).exists());
        assertTrue(new File(filename).length() != 0);




    }


}
