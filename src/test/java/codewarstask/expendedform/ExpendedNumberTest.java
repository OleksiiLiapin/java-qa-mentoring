package codewarstask.expendedform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpendedNumberTest {

    @Test
    public void basicTest(){
        Assertions.assertEquals(ExpendedNumber.expandedForm(12), "10 + 2");
        Assertions.assertEquals(ExpendedNumber.expandedForm(42), "40 + 2");
        Assertions.assertEquals(ExpendedNumber.expandedForm(70304), "70000 + 300 + 4");
        Assertions.assertEquals(ExpendedNumber.expandedForm(9000000), "9000000");
    }


}
