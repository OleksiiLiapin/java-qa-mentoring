package codewarstask.bingocardgame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class BingoCardTest {

    @Test
    public void cardHas24Numbers(){
        Assertions.assertEquals(24, BingoCard.getCard().length, "Game has 24 numbers");
    }

    @Test
    public void cardHasUniqueNumbers(){
        for (int i=0; i<10; i++)
        {
            String[] card = BingoCard.getCard();
            Set<String> set = new HashSet<String>(Arrays.asList(card));
            assertTrue(String.format("Card numbers are not unique: %s", String.join(" ",card)), set.size() == card.length);
        }

    }


    @Test
    public void columnsIntheCorrectRange(){
        String[] card = BingoCard.getCard();
        checkColumnsValue(card, "B", 1, 5, 1, 15);
        checkColumnsValue(card, "I", 6, 10, 16, 30);
        checkColumnsValue(card, "N", 11, 14, 31, 45);
        checkColumnsValue(card, "G", 15, 19, 46, 60);
        checkColumnsValue(card, "O", 20, 24, 61, 75);


    }


    private void checkColumnsValue(String [] card,String letterColumn, int startPoint, int endPoint, int startRange, int endRange){
        for (int i=startPoint-1; i<endPoint; i++)
        {
            int n = Integer.parseInt(card[i].substring(1));
            Assertions.assertTrue(n >= startRange && n <= endRange, String.format("Number should be in range from %d to %d, found: '%s')", startRange, endRange, card[i]));
        }


    }


}
