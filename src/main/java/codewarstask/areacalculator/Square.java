package codewarstask.areacalculator;

public class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }

}
