package codewarstask.areacalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Execute {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();{{
            shapes.add(new Circle(3.4));
            shapes.add(new Triangle(2.1,1.2));
            shapes.add(new Rectangle(2.1,5.4));
        }}

        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.valueOf(o2.getArea()).compareTo(o1.getArea());
            }
        });
    }
}
