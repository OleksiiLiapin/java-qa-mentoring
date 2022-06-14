package codewarstask.theoffice2boredomscore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheOfficeTest {
    @Test
    public void Tests(){
        Person person1 = new Person("Jassy", "account");
        Person person2 = new Person("John", "canteen");
        Person person3 = new Person("Liz", "retail");
        Person person4 = new Person("Mike", "cleaning");
        Person person5 = new Person("Stepan", "cleaning");
        Person person6 = new Person("Sweet", "pissing about");

        Person [] staff = {person1,person2,person3,person4,person5, person6 };
        int calculateBordom = TheOffice.boredomCount(staff);
        assertEquals(49, calculateBordom);

        String boredomPhrase = TheOffice.boredom(staff);
        assertEquals("kill me now", boredomPhrase);


        Person person10 = new Person("Jassy", "account");
        Person person11 = new Person("John", "canteen");
        Person person12 = new Person("Liz", "pissing about");
        Person person13 = new Person("Mike", "pissing about");
        Person person14 = new Person("Stepan", "pissing about");
        Person person15 = new Person("Sweet", "pissing about");
        Person [] staff2 = {person10,person11,person12,person13,person14, person15 };
        String boredomPhrase2 = TheOffice.boredom(staff2);
        assertEquals("party time!!", boredomPhrase2);

    }
}
