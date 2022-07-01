package codewarstask.salesmantravel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Travel {
    public static String travel(String r, String zipcode) {
        if (zipcode.isEmpty()) {
            return ":/";
        }

        String [] addressSortedZip = r.split(",");
        StringBuffer streetName = new StringBuffer(zipcode+":");
        StringBuffer streetsNumberBuffer = new StringBuffer("/");
        String updatedAddress;
        String streetNumber = "";
        for (String address: addressSortedZip) { //123 Main Street St. Louisville OH 43071
            if(zipCodeIsMatch(address,zipcode)){                                                //iterate through the array
                address = address.replaceAll(" "+zipcode, ",");           // remove zip code from the end of the string
                streetNumber = address.replaceAll("[a-z, A-Z.!]", "");    // assign the street number by removing all of the characters beside digits
                address = address.replaceAll("[0-9]", "");                //remove street number from the address
                streetsNumberBuffer.append(streetNumber.trim()).append(",");                    //add street number to the end of the string
                streetName.append(address.trim()).append(",");
                streetName.deleteCharAt(streetName.length()-1);
            }
        }
        streetName.deleteCharAt(streetName.length()-1);
        streetName.append(streetsNumberBuffer);

        if(streetName.length() > zipcode.length()+2){
            streetName.deleteCharAt(streetName.length() - 1);
        } else if (streetName.length()==zipcode.length()+1){
            streetName.deleteCharAt(streetName.length() - 1);
            streetName.append(":/");
        }

    System.out.println(streetName.toString());
    return streetName.toString();
    }

    private static boolean zipCodeIsMatch(String phrase,String zip){
        String REGEX_FIND_WORD="(?i).*?\\b%s\\b.*?";
        String regex=String.format(REGEX_FIND_WORD, Pattern.quote(zip));
        return phrase.matches(regex);

    }
}
