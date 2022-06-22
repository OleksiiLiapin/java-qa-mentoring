package codewarstask.areacalculatorsortedshape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class Shape implements Comparable <Shape>  {
   double area;
    abstract double getArea();

    public double doubleRound ( double num){
        return Math.round(num * 100.0) / 100.0;
    }


    @Override
    public int compareTo(Shape o) {
        return Double.compare(getArea(), o.getArea());
    }
}
