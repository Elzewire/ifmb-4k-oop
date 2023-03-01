package polygons.impl;

import math.Vector2D;
import polygons.Polygon2D;

public class Triangle extends Polygon2D {

    public Triangle(Vector2D p1, Vector2D p2, Vector2D p3) {
        vertices = new Vector2D[3];
        vertices[0] = p1;
        vertices[1] = p2;
        vertices[2] = p3;
    }

    @Override
    public String toString() {
        return "I have 3 sides";
    }

    @Override
    public double area() {
        double a = vertices[0].length(vertices[1]);
        double b = vertices[0].length(vertices[2]);
        double c = vertices[1].length(vertices[2]);

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(
                    new Vector2D(0, 0),
                    new Vector2D(1, 0),
                    new Vector2D(0, 1)
                );

        System.out.println(t.area());
    }
}
