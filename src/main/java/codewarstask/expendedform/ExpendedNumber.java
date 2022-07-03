package codewarstask.expendedform;

public class ExpendedNumber {
    public static String expandedForm(int num) {
        int numberCopy = num;
        int multipty = 10;
        String textNum = "";
        while (!(num/10==0)){
            numberCopy = num / multipty;

            if (String.valueOf(numberCopy).length()==1){
                numberCopy = numberCopy  * multipty;
                textNum = textNum + numberCopy + " + ";
                num= num - numberCopy;
                multipty=1;
            }

            if (num==0){
                return String.valueOf(numberCopy);
            }
            multipty*=10;
        }

        textNum+=num;
        return textNum;
    }
}
