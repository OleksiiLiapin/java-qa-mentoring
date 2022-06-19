package codewarstask.areacalculator;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (radius * radius) * Math.PI;
    }
}
