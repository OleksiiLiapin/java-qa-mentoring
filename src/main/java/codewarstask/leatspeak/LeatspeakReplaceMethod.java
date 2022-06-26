package codewarstask.leatspeak;

public class LeatspeakReplaceMethod extends Encoder {
    public String encode(String source){
        if(source==null){
            return "";
        }

        source = source.replaceAll("(?i)a", "4");
        source = source.replaceAll("(?i)e", "3");
        source = source.replaceAll("(?i)l", "1");
        source = source.replaceAll("(?i)m", "/^^\\\\");
        source = source.replaceAll("(?i)o", "0");
        source = source.replaceAll("(?i)u", "(_)");

        return source;
    }

}
