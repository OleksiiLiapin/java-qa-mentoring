//Write function toInitials returs initials for a given person name. E.g: "Bill Gates" -> "B. G."
//        Note: initials should be separated with a space.
package codewarstask.initials;
public class Initials {

    public static String initials (String nameSurname){
        String [] fullnName = nameSurname.split(" ");
        char firstLetterName = fullnName[0].charAt(0);
        char firstLetterSurname = fullnName[1].charAt(0);
        //System.out.println(firstLetterName + ". " + firstLetterSurname+".");
        return firstLetterName + ". " + firstLetterSurname+".";
    }
}
