package codewarstask.areacalculatorsortedshape;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

import static org.junit.Assert.*;

public class RunCodeTest {

    @Test
    public void sortTest() {
        double side = 4;
        double radius = 6.5;
        double base = 5;
        double height = 2;
        ArrayList <Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Square(9));//81
        shapes.add(new Square(9));//81
        shapes.add(new Triangle(base, height));//5.0
        shapes.add(new Square(side));//16
        shapes.add(new Rectangle(4,5));//20
        shapes.add(new Circle(radius));//132.73
        shapes.add(new Triangle(3.5, height));//3.5

        ArrayList<Shape> shapesSortedManually = new ArrayList<Shape>();
        shapesSortedManually.add(new Triangle(3.5, height));//3.5
        shapesSortedManually.add(new Triangle(base, height));//5
        shapesSortedManually.add(new Square(side));//16
        shapesSortedManually.add(new Rectangle(4, 5));//20
        shapesSortedManually.add(new Square(9));//81
        shapesSortedManually.add(new Square(9));//81
        shapesSortedManually.add(new Circle(radius));//132.73

        Collections.sort(shapes);

        for (int i = 0; i < shapes.size(); i++) {
            Assertions.assertEquals(shapes.get(i).getArea(),
                    shapesSortedManually.get(i).getArea());

        }



    }


}


