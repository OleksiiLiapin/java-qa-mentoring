package codewarstask.leatspeak;

import java.util.HashMap;
import java.util.Map;

public class Execute {
    public static void main(String[] args) {
//        Leatspeak leat = new Leatspeak();
//        String example = leat.encode("aame");
//        System.out.println(example);
        Map <String,String> dictionary = new HashMap<>();{{
            dictionary.put("a", "4");
            dictionary.put("e", "3");
            dictionary.put("l", "1");
            dictionary.put("m", "/^^\\");
            dictionary.put("o", "0");
            dictionary.put("u", "(_)");
        }}

        Leatspeak leat = new Leatspeak();
        LeatspeakReplaceMethod leatReplace = new LeatspeakReplaceMethod();
        String it = leat.encode("AaeElLmMoO0J0U7u");
        String it2 = leatReplace.encode("AaeElLmMoO0J0U7u");
            System.out.println(it);
            System.out.println(it2);







    }
}


