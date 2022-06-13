package codewarstask.interactivedictionary;

import java.util.HashMap;

public class Dictionary {
    private HashMap <String, String> dictionary;
    public Dictionary (){
        dictionary = new HashMap<>();
    }

    public void newEntry (String key, String value){
        dictionary.put(key, value);
    }

    public String look (String key){
        if (dictionary.containsKey(key)){
            return dictionary.get(key);
        } else
            return "Cant find entry for " + key;
    }
}
