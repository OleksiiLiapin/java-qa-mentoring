package codewarstask.areacalculator;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height * width;
    }
}
