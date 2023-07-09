class Point {
    private int x, y;

    public Point() {
        x = y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object otherObj) {
        if (this == otherObj)
            return true;
        else
            return false;
        // Point p = (Point) otherObj;
        // if (p.x == this.x && p.y == this.y)
        // return true;
        // return false;
    }

    public String toString() { // method Object
        return "[" + x + ", " + y + "]";
    }
}

public class Main11 {
    public static void main(String[] args) {
        double d = 3.14;
        System.out.println(d);

        Point p = new Point(10, 20);
        System.out.println(p);

    }
}