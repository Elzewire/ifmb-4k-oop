class MyClass {
    int x;
    float y;
    String name;

    public MyClass(int x, float y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public MyClass() {
        this.x = 0;
        this.y = 0;
        this.name = "";
    }

    @Override
    public String toString() {
        return x + " " + y + " " + name;
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass(14, 1.12f, "Hello");
        System.out.println(mc);
    }
}

class MyClass2 {

}