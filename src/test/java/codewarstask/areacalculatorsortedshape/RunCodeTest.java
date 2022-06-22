package codewarstask.areacalculatorsortedshape;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class RunCodeTest {

        @Test
        public void sortTest() {
            double side = 4;
            double radius = 6.5;
            double base = 5;
            double height = 2;
            List<Shape> shapes = new ArrayList<Shape>();
            shapes.add(new Square(side));//16
            shapes.add(new Triangle(base, height));//5
            shapes.add(new Square(side));//16
            //shapes.add(new Rectangle(4, 5));//20
            shapes.add(new Circle(radius));//132.73
            shapes.add(new Triangle(base, height));//5.0
            Collections.sort(shapes);
           assertEquals(shapes.size(), 6);
            assertEquals(shapes.get(0).getArea(), 5.0, 0.001);
            assertEquals(shapes.get(1).getArea(), 5.0, 0.001);
            assertEquals(shapes.get(2).getArea(), 16, 0.001);
            assertEquals(shapes.get(3).getArea(), 16, 0.001);
            assertEquals(shapes.get(4).getArea(), 20, 0.001);
            assertEquals(shapes.get(5).getArea(), 132.73, 0.1);
        }

    }


