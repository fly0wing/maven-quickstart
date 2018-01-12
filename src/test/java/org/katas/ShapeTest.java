package org.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.Assert.assertEquals;

public class ShapeTest {
    @Test
    public void calcRectangleArea() throws Exception {
        int width = 10;
        int height = 20;
        double area = new Rectangle(width, height).calcArea();
        assertEquals(200, area, 0.00001);
    }
    @Test
    public void calcCircularArea() throws Exception {
        int r = 10;
        double area = new Circular(r).calcArea();
        assertEquals(314.16, area, 0.001);
        assertEquals(r * r * Math.PI, area, 0.00001);
    }


    @Test
    public void calcSquareArea() throws Exception {
        int a = 10;
        Square square = new Square(a);
        double area = square.calcArea();
        assertEquals(100, area, 0.001);
    }

}
