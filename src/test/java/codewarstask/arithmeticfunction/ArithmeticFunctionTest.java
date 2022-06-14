package codewarstask.arithmeticfunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArithmeticFunctionTest {
    @Test

    public void basicTest(){
        assertEquals(7, ArithmeticFunction.arithmetic(2,5,"add") );
        assertEquals(9, ArithmeticFunction.arithmetic(11,2,"subtract") );
        assertEquals(15, ArithmeticFunction.arithmetic(3,5,"multiply") );
        assertEquals(10, ArithmeticFunction.arithmetic(50,5,"divide") );
    }
}
