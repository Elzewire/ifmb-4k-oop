public class Rectangle extends Polygon2D{

    double width;
    double height;

    public Rectangle(Vector2D point, double width, double height) {
        this.width = width;
        this.height = height;
        vertices = new Vector2D[4];

        vertices[0] = point;
        vertices[1] = new Vector2D(point.x + width, point.y);
        vertices[2] = new Vector2D(point.x, point.y + height);
        vertices[3] = new Vector2D(point.x + width, point.y + height);
    }

    @Override
    public double area() {
        return width * height;
    }
}
