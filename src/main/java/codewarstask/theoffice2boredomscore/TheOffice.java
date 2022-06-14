package codewarstask.theoffice2boredomscore;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class TheOffice {
private static HashMap <String, Integer> boredomLevelDepartments = new HashMap<>()
{{
put("account", 1);
put("finance", 2);
put("canteen", 10);
put("trading", 6);
put("change", 6);
put("IS", 8);
put("retail", 5);
put("cleaning", 4);
put("pissing about", 25);
}};

    public static int boredomCount(Person [] staff){
        int boredomCount=0;
        for (int i = 0; i < staff.length; i++) {
            String personDepartment = staff[i].department;
            for (String department : boredomLevelDepartments.keySet()) {
                if (department.equals(personDepartment)){
                    boredomCount+=boredomLevelDepartments.get(department);
                }
            }
        }
        return boredomCount;
    }



    public static String boredom(Person[] staff) {
        int boredomSumPoint = boredomCount(staff);
        if (boredomSumPoint >= 100){
            return "party time!!";
        } else if (boredomSumPoint >= 80){
            return "i can handle this";
        } else {
            return "kill me now";
        }
    }



}
