package codewarstask.initials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InitialsTest {
    @Test
    public void basicTest(){
        Assertions.assertEquals(Initials.initials("Kerry King"), "K. K.");
        Assertions.assertEquals(Initials.initials("Tata Aslanyan"), "T. A.");

    }
}
