package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test

    public void testArea(){
        Point p1 = new Point(2,5);
        Point p2 = new Point (4,7);
        Assert.assertEquals(Math.floor(p1.distance(p2.x,p2.y)), 2.0);
    }
}
