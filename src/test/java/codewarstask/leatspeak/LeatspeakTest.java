package codewarstask.leatspeak;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeatspeakTest {
   @Test
    public void encodeToLeatspeak(){
       Leatspeak leat = new Leatspeak();
       LeatspeakReplaceMethod leatReplace = new LeatspeakReplaceMethod();
       assertEquals("",leat.encode(null), "Null string should return empty string");
       assertEquals(leat.encode("name"), "n4/^^\\3");
       assertEquals(leat.encode("good morning"), "g00d /^^\\0rning");
       assertEquals(leat.encode("AaeElLmMoO0J0U7u"), "443311/^^\\/^^\\000J0(_)7(_)");

       assertEquals("",leatReplace.encode(null), "Null string should return empty string");
       assertEquals(leatReplace.encode("name"), "n4/^^\\3");
       assertEquals(leatReplace.encode("good morning"), "g00d /^^\\0rning");
       assertEquals(leatReplace.encode("AaeElLmMoO0J0U7u"), "443311/^^\\/^^\\000J0(_)7(_)");

   }


}
