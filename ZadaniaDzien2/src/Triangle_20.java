public class Triangle_20 extends Shape_20 {
    double h;

    public Triangle_20(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    double calculatePerimeter() {
        //zakladamy ze mamy doczynienia z trojkatem prostokatnym
        return a+h+Math.sqrt(Math.pow(a, 2.0)+Math.pow(h, 2.0));
    }

    @Override
    double calculateArea() {
        return 0.5*a*h;
    }
}
