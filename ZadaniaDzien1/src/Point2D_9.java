public class Point2D_9 implements Movable_10{
    private double x, y;

    public Point2D_9(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void move(MoveDirection_10 moveDirection10){
        this.x=this.x + moveDirection10.getX();
        this.y=this.y + moveDirection10.getY();
    }

    @Override
    public String toString() {
        return "Point2D_9{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
