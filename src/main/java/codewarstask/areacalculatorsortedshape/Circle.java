package codewarstask.areacalculatorsortedshape;

public class Circle extends Shape {
    private double area;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = (radius * radius) * Math.PI;
    }

    @Override
    double getArea() {
        return (radius * radius) * Math.PI;
    }
}
