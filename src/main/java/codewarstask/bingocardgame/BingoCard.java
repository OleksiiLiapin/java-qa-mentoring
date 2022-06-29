package codewarstask.bingocardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoCard {
    public static String [] getCard(){
    List <String> columnBingo = new ArrayList<>();
    List <String> columnBingo_B, columnBingo_I, columnBingo_N, columnBingo_G, columnBingo_O;
    columnBingo_B = getRandomBingoNumbers("B", 5,1,15);
    columnBingo_I = getRandomBingoNumbers("I", 5,16,30);
    columnBingo_N = getRandomBingoNumbers("N", 4,31,45);
    columnBingo_G = getRandomBingoNumbers("G", 5,46,60);
    columnBingo_O = getRandomBingoNumbers("O", 5,61,75);

    columnBingo.addAll(columnBingo_B);
    columnBingo.addAll(columnBingo_I);
    columnBingo.addAll(columnBingo_N);
    columnBingo.addAll(columnBingo_G);
    columnBingo.addAll(columnBingo_O);

    return columnBingo.toArray(new String[0]);

    }


    private static ArrayList<String> getRandomBingoNumbers(String bingoColumn,int countNumbers, int startRange, int endRange) {
        ArrayList<String> listOfBingoNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countNumbers; i++) {
            int num = random.nextInt(startRange, endRange);
            if (listOfBingoNumbers.contains(bingoColumn+num)) {
                i--;
                continue;
            }
            listOfBingoNumbers.add(bingoColumn + num);
        }
        return listOfBingoNumbers;
    }
}
