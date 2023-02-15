public class Tour {

    private Node start;

    private class Node {
        private Point p;
        private Node next;

        public Node(Point p) {
            this.p = p;
            this.next = null;
        }
    }

    // creates an empty tour
    public Tour() {
        start = null;
    }

    // creates the 4-point tour a->b->c->d->a (for debugging)
    public Tour(Point a, Point b, Point c, Point d) {
        Node first = new Node(a);
        start = first;

        Node second = new Node(b);
        first.next = second;

        Node third = new Node(c);
        second.next = third;

        Node fourth = new Node(d);
        third.next = fourth;
        fourth.next = start;
    }

    // returns the number of points in this tour
    public int size() {
        if (start == null) return 0;

        Node current = start;
        int size = 0;
        do {
            size++;
            current = current.next;
        } while (current != start);
        return size;
    }

    // returns the length of this tour
    public double length() {
        if (start == null) return 0;
        Node current = start;
        double length = 0.0;
        do {
            double distance = current.p.distanceTo(current.next.p);
            length += distance;
            current = current.next;
        } while (current != start);
        return length;
    }

    // returns a string representation of this tour
    public String toString() {
        String s = "";
        if (start == null) return s;

        Node current = start;
        do {
            s = s + current.p + " ";
            current = current.next;
        } while (current != start);
        return s;
    }

    // draws this tour to standard drawing
    public void draw() {
        Node current = start;
        do {
            current = current.next;
            current.p.drawTo(current.next.p);
        } while (current != start);

    }

    // inserts p using the nearest neighbor heuristic
    public void insertNearest(Point p) {
        if (start == null) {
            start = new Node(p);
            start.next = start;
            return;
        }

        Node current = start;
        Node newNode = new Node(p);
        double min = Double.MAX_VALUE;
        Node minNode = start;

        do {
            // System.out.println(p);
            // System.out.println(current);
            double distance = p.distanceTo(current.p);
            if (distance < min) {
                min = distance;
                minNode = current;
            }
            current = current.next;
        } while (current != start);
        newNode.next = minNode.next;
        minNode.next = newNode;
    }

    // inserts p using the smallest increase heuristic
    public void insertSmallest(Point p) {
        if (start == null) {
            start = new Node(p);
            start.next = start;
            return;
        }

        Node current = start;
        Node newNode = new Node(p);
        double min = Double.MAX_VALUE;
        Node minNode = start;

        do {
            double a = current.p.distanceTo(p);
            double b = p.distanceTo(current.next.p);
            double c = current.p.distanceTo(current.next.p);
            double delta = a + b - c;
            if (delta < min) {
                min = delta;
                minNode = current;
            }
            current = current.next;
        } while (current != start);
        newNode.next = minNode.next;
        minNode.next = newNode;

    }

    // tests this class by calling all constructors and instance methods
    public static void main(String[] args) {

        // define 4 points, corners of a square
        Point a = new Point(1.0, 1.0);
        Point b = new Point(1.0, 4.0);
        Point c = new Point(4.0, 4.0);
        Point d = new Point(4.0, 1.0);
        Tour squareTour = new Tour(a, b, c, d);


        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);


        // // create the tour a -> b -> c -> d -> a
        Point e = new Point(5.0, 6.0);
        // squareTour.insertNearest(e);
        squareTour.insertSmallest(e);
        squareTour.draw();

    }
}

