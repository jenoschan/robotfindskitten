public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean egal(int x, int y) {
        return x == this.x && y == this.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}