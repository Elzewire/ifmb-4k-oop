package polygons.impl;

import math.Vector2D;

public class Square extends Rectangle {

    public Square(Vector2D point, double width) {
        super(point, width, width);
    }

    @Override
    public String toString() {
        return "I have 4 sides";
    }
}
