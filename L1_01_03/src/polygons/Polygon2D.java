package polygons;

import com.sun.tools.javac.Main;
import math.Vector2D;

public abstract class Polygon2D {

    public Vector2D[] vertices;

    public abstract double area();

    public static void main(String[] args) {
        Polygon2D[] polygons = new Polygon2D[10];

    }
}
