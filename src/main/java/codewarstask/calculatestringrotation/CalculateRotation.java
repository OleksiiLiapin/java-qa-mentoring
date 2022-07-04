package codewarstask.calculatestringrotation;

public class CalculateRotation {

    public static int shiftedDiff(String first, String second){
        String input = "";
        int count = 0;

        for(int i = 0; i < first.length(); i++){
            if(second.equals(first)){
                return count;
            }
            first = shift(first);
            count++;
        }
        return -1;
    }

    private static String shift(String s) {
        return s.charAt(s.length()-1)+s.substring(0, s.length()-1); // name 3+
    }
}

