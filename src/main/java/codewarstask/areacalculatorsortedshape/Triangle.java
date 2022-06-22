package codewarstask.areacalculatorsortedshape;

public class Triangle extends Shape {
    private double triangleBase;
    private double triangleHeight;
    public Triangle (double triangleBase, double triangleHeight){
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
        area = (triangleBase/2) * triangleHeight;
    }

    @Override
    double getArea() {
        return (triangleBase/2) * triangleHeight;
    }
}
