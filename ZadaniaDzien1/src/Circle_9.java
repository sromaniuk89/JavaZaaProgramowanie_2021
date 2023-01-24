public class Circle_9 implements Movable_10, Resizable_11{
    private Point2D_9 center, point;

    @Override
    public void move(MoveDirection_10 moveDirection10) {
        //przesuniecie okregu polega na przesunieciu jego punktow charakterystycznych
        center.move(moveDirection10);
        point.move(moveDirection10);
    }

    public Circle_9(Point2D_9 center, Point2D_9 point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        //odleglosc miedzy dwoma punktami na plaszczyznie jest to pierwiastek z sumy kwadratow roznic wspolrzednych
        return Math.sqrt(Math.pow(point.getX()-center.getX(), 2.0)+Math.pow(point.getY()-center.getY(), 2.0));
    }

    public double getPerimeter(){
        return 2*Math.PI*this.getRadius(); //O=2*PI*R
    }

    public double getArea(){
        return Math.PI*Math.pow(this.getRadius(), 2.0); //A=PI*R^2
    }

    public Point2D_9 getCenter() {
        return center;
    }

    public Point2D_9 getPoint() {
        return point;
    }

    @Override
    public void resize(double resizeFactor) {
        this.point.setX(this.center.getX()+resizeFactor*(this.point.getX()-this.center.getX()));
        this.point.setY(this.center.getY()+resizeFactor*(this.point.getY()-this.center.getY()));
    }
}
