package codewarstask.areacalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator cal = new Calculator();
@Test
    public void rectangleAre(){
        Shape rec = new Rectangle(1.112,2);
        Shape rec2 = new Rectangle(1.112,2);
        double area = cal.doubleRound(cal.getTotalArea(rec, rec2));
        assertEquals(4.45,area);
    }
 @Test
    public void triangleArea  (){
     Shape triangle = new Triangle(2.4,3.6);
    double triangleArea = cal.doubleRound(cal.getTotalArea(triangle));
    assertEquals(4.32, triangleArea, 0.0001);
    }

    @Test
    public void circleArea (){
    Shape circle = new Circle(3);
    double circleArea = cal.doubleRound(cal.getTotalArea(circle));
    assertEquals(28.27, circleArea);
    }

    @Test
    public void totalAreOfSeveralShapes (){
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(2.4,3.6);
        Shape rec = new Rectangle(1.112,2);
        Shape rec2 = new Rectangle(1.112,2);
        double totalArea = cal.doubleRound(cal.getTotalArea(circle, triangle,
                rec, rec2));
        assertEquals(37.04, totalArea);

    }



}
