

package codewarstask.leatspeak;
import java.util.*;
//https://www.codewars.com/kata/543bfbecdef6345f52000e4d/java -- L3375p34k
public class Leatspeak extends Encoder {


    public String encode (String source){
        if(source==null){
            return "";
        }

        List <String> key = new ArrayList<>();
        key.add("a");
        key.add("e");
        key.add("l");
        key.add("m");
        key.add("o");
        key.add("u");

        List <String> value = new ArrayList<>();
        value.add("4");
        value.add("3");
        value.add("1");
        value.add("/^^\\");
        value.add("0");
        value.add("(_)");


        String [] letter = source.split("");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<letter.length;i++) {
            for (int j = 0; j < key.size(); j++) {
                if (letter[i].equalsIgnoreCase(key.get(j))){
                    letter[i] = value.get(j);
            }
            }
            builder.append(letter[i]);
        }

       return builder.toString();
  }



}
