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
        // if (this == otherObj)
        //     return true;
        // return false;
        Point p = (Point) otherObj;
        if (p.x == this.x && p.y == this.y)
            return true;
        return false;
    }

    public String toString(){
        return "("+x+" , "+y+")";
    }
}

public class Main765 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        System.out.println(p1);
        System.out.println(p2);
        // if(p1 == p2){
        if (p1.equals(p2)) { // equals() method comes from Object class. It is defined "=="
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}