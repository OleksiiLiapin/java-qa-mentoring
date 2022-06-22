package codewarstask.areacalculatorsortedshape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunCode {
    public static void main(String[] args) {
        double side = 4;
        double radius = 6.5;
        double base = 5;
        double height = 2;
        ArrayList <Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Square(9));//81
        shapes.add(new Triangle(base, height));//5.0
        shapes.add(new Square(side));//16
        shapes.add(new Rectangle(4,5));//20
        shapes.add(new Circle(radius));//132.73
        shapes.add(new Triangle(3.5, height));//3.5

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).getArea());
        }

        Collections.sort(shapes);
        System.out.println("Sorted");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).getArea());
        }

    }
    }

