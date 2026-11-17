package q2;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("Distance between (0,0) and (10,30.5): " + p1.distance(p2));
        System.out.println("Static distance: " + MyPoint.distance(p1, p2));
    }
}

