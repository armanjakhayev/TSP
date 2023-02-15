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

//    // creates the 4-point tour a->b->c->d->a (for debugging)
//    public Tour(Point a, Point b, Point c, Point d) {
//        Node first = new Node(a);
//        Node second = new Node(b);
//        Node third = new Node(c);
//        Node fourth = new Node(d);
//    }

//    public void addNode(Point e) {
//        Node newNode = new Node(e);
//
//        // degenerate case for empty quote
//        if (start == null) {
//            start = newNode;
//            start.next = start;
//        }
//
//        // otherwise
//        else {
//
//            // find the "last" node in the circular linked list
//            Node x = start;
//            do {
//                x = x.next;
//            } while (x.next != start);
//
//            // insert new node
//            newNode.next = start;
//            x.next = newNode;
//        }
//    }

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
        Tour.Node current = start;
        double length = 0.0;
        do {
            current = current.next;
            double distance = current.p.distanceTo(current.next.p);
            length += distance;
        } while (current != start);
        return length;
    }

    // returns a string representation of this tour
    public String toString() {
        String s = "";
        if (start == null) return s;

        Tour.Node current = start;
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
//    public void insertNearest(Point p) {
//        Tour.Node current = start;
//
//        double min = Double.MAX_VALUE;
//        Tour.Node minNode = start;
//        Tour.Node newNode = new Tour.Node(p);
//        do {
//            current = current.next;
//            double distance = p.distanceTo(current.p);
//            if (distance < min) {
//                min = distance;
//                minNode.next = current;
//            }
//        } while (current != start);
//
//    }

    // inserts p using the smallest increase heuristic
//    public void insertSmallest(Point p) {
//
//    }

    // tests this class by calling all constructors and instance methods
    public static void main(String[] args) {

        // define 4 points, corners of a square
        Point a = new Point(1.0, 1.0);
        Point b = new Point(1.0, 4.0);
        Point c = new Point(4.0, 4.0);
        Point d = new Point(4.0, 1.0);
        Point e = new Point(5.0, 6.0);

        StdDraw.setXscale(0, 6);
        StdDraw.setYscale(0, 6);


        // create the tour a -> b -> c -> d -> a
        Tour squareTour = new Tour(a, b, c, d);
        double length = squareTour.length();
        System.out.println("Tour size = " + squareTour.size());
        System.out.println("Tour length = " + length);
        System.out.println(squareTour.toString());
        System.out.println(squareTour.draw());


    }
}

