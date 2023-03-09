public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
