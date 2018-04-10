package ru.stqa.pft.sandbox;

public class CalculateDistance {

    public static void main(String[] args) {
        Point p = new Point(2,5,3,7);

        System.out.println("Distance between points" + "=" + distance(p));

    }

    public static double distance(Point p) {
        return Math.sqrt((p.x2 - p.x1) * (p.x2 - p.x1) + (p.y2 - p.y1) * (p.y2 - p.y1));
    }
}
