package codewarstask.persistentbugger;

import codewarstask.persistdebugger.Persist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersistTest {
    @Test
    public void basicTest(){
        Assertions.assertEquals(Persist.persistence(39), 3);
        Assertions.assertEquals(Persist.persistence(4), 0);
        Assertions.assertEquals(Persist.persistence(25), 2);
        Assertions.assertEquals(Persist.persistence(999), 4);


    }

}
