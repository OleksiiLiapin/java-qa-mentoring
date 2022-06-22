//Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`
//TDD Area Calculations: https://www.codewars.com/kata/5702e2f380b8c86df3000003/train/java
package codewarstask.areacalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Calculator {

        public double getTotalArea (Shape...shape){
            double area = 0;
            for (Shape sh : shape) {
                area += sh.getArea();
            }
            return doubleRound(area);
        }

        public double doubleRound ( double num){
            return Math.round(num * 100.0) / 100.0;
        }

    }



