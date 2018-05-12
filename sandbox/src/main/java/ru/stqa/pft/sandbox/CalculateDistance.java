package ru.stqa.pft.sandbox;

public class CalculateDistance {

    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point (4,7);

        System.out.println("Distance between points" + "=" + p1.distance(p2.x,p2.y));

    }


}
