package codewarstask.areacalculatorsortedshape;

import java.util.Comparator;

public class Rectangle extends Shape {
    private double area;
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        area = height * width;
    }

    @Override
    double getArea() {
        return height * width;
    }
}
