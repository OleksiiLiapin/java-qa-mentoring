import codewarstask.areacalculator.*;
import codewarstask.arithmeticfunction.ArithmeticFunction;
import codewarstask.reversedarray.ReversedArray;
import codewarstask.theoffice2boredomscore.Person;
import codewarstask.theoffice2boredomscore.TheOffice;

import java.lang.reflect.Array;
import java.util.Arrays;



public class Main {



    public static void main(String[] args) {
         double side = 4;
        Shape shape = new Square(side);
        Calculator cal = new Calculator();
        System.out.println("square area: " + cal.getTotalArea(shape));

        Shape shape1 = new Triangle(2.3,2.673);
        System.out.println("Triangle are: "+ cal.getTotalArea(shape1));

        System.out.println("Sum of areas " + cal.getTotalArea(shape,shape1));

        Shape rec = new Rectangle(1.112,2);
        Shape rec2 = new Rectangle(1.112,2);
        System.out.println("rec area " + cal.getTotalArea(rec, rec2));
        double rounded = cal.doubleRound(rec.getArea() + rec2.getArea());
        System.out.println("Rounded rec " + rounded);


        Calculator cal2 = new Calculator();
        System.out.println("nope shape = " + cal2.getTotalArea());

    }

}
