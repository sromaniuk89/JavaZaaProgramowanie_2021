public class Hexagon_20 extends Shape_20 {

    public Hexagon_20(double a) {
        this.a=a;
    }

    @Override
    double calculatePerimeter() {
        return 6*a;
    }

    @Override
    double calculateArea() {
        return Math.pow(a, 2.0)*Math.sqrt(6.75);
    }
}
