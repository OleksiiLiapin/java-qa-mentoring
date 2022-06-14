import codewarstask.theoffice2boredomscore.Person;
import codewarstask.theoffice2boredomscore.TheOffice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        codewarstask.block.Block b = new codewarstask.block.Block(new int[]{2,4,6});
//        System.out.println(b.getWidth()); // -> 2);
//        System.out.println( b.getLength()); // -> 4);
//        System.out.println(b.getHeight()); // -> 6);
//        System.out.println(b.getVolume()); // -> 48);
//        System.out.println(b.getSurfaceArea()); // -> 88 );

//        java.codewarstask.leapyear.LeapYear year = new java.codewarstask.leapyear.LeapYear(2032);
//        java.codewarstask.leapyear.LeapYear year2 = new java.codewarstask.leapyear.LeapYear(1960);
//        java.codewarstask.leapyear.LeapYear year3 = new java.codewarstask.leapyear.LeapYear(1993);
//        java.codewarstask.leapyear.LeapYear year4 = new java.codewarstask.leapyear.LeapYear(2000);
//        System.out.println("From instance. 2032 is leap year - " + java.codewarstask.leapyear.LeapYear.isLeapYear(year.getYear()));
//        System.out.println("From instance. 1960 is leap year - " + java.codewarstask.leapyear.LeapYear.isLeapYear(year2.getYear()));
//        System.out.println("From instance. 1993 is NOT leap year - " + java.codewarstask.leapyear.LeapYear.isLeapYear(year3.getYear()));
//        System.out.println("From instance. 2000 is leap year - " + java.codewarstask.leapyear.LeapYear.isLeapYear(year4.getYear()));


        Person person1 = new Person("Jassy", "account");
        Person person2 = new Person("John", "canteen");
        Person person3 = new Person("Liz", "retail");
        Person person4 = new Person("Mike", "cleaning");
        Person person5 = new Person("Stepan", "cleaning");
        Person person6 = new Person("Sweet1", "pissing about");
        Person person7 = new Person("Sweet2", "pissing about");
        Person person9 = new Person("Sweet3", "account");

        Person [] staff = {person1,person2,person3,person4,person5, person6,person7,person9  };
        System.out.println(TheOffice.boredomCount(staff));

        System.out.println(TheOffice.boredom(staff));

        Person person10 = new Person("Jassy", "account");
        Person person11 = new Person("John", "canteen");
        Person person12 = new Person("Liz", "pissing about");
        Person person13 = new Person("Mike", "pissing about");
        Person person14 = new Person("Stepan", "pissing about");
        Person person15 = new Person("Sweet", "pissing about");
        Person [] staff2 = {person10,person11,person12,person13,person14, person15 };
        String boredomPhrase2 = TheOffice.boredom(staff2);
        System.out.println(TheOffice.boredomCount(staff2));
        System.out.println(boredomPhrase2);

        //assertEquals("party time!!", boredomPhrase2);

        Person person16 = new Person("Jassy", "trading");
        Person person17 = new Person("John", "canteen");
        Person person18 = new Person("Liz", "retail");
        Person person19 = new Person("Mike", "cleaning");
        Person person20 = new Person("Stepan", "cleaning");
        Person person24 = new Person("Stepan", "cleaning");
        Person person21 = new Person("Sweet1", "pissing about");
        Person person22 = new Person("Sweet2", "pissing about");
        Person person23 = new Person("Sweet3", "account");

        Person [] staff3 = {person16,person17,person18,person19,person20, person21,person22,person23, person24};
        System.out.println(TheOffice.boredomCount(staff3));

        System.out.println(TheOffice.boredom(staff3));









    }

}
