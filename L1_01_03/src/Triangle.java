public class Triangle extends Polygon2D {

    public Triangle() {
        vertices = new Vector2D[3];
    }

    @Override
    public String toString() {
        return "I have 3 sides";
    }

    @Override
    public double area() {
        return 0;
    }
}
