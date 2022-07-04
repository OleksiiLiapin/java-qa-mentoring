package codewarstask.decodemorsecode;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String phrase = "";
        String [] words = morseCode.split("   ");
        for (int i = 0; i < words.length; i++) {
            String [] letters = words[i].split(" ");
            for (int j = 0; j < letters.length; j++) {
                if (MorseCode.get(letters[j]) != null){
                    phrase+= MorseCode.get(letters[j]);
                }
            }
            phrase+=' ';
        }
        return phrase.trim();
    }
}
