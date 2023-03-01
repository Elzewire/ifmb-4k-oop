package math;

public class Vector2D {
    public double x;
    public double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D sum(Vector2D v2) {
        return new Vector2D(x + v2.x,y + v2.y);
    }

    public double length(Vector2D v2) {
        return Math.sqrt(Math.pow(v2.x - x, 2) + Math.pow(v2.y - y, 2));
    }

    @Override
    public String toString() {
        return "("+ x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(0, 0);
        Vector2D v2 = new Vector2D(1, 1);
        System.out.println(v2.sum(v1));
        System.out.println(v1.length(v2));
    }
}
