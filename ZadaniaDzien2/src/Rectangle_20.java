public class Rectangle_20 extends Shape_20 {
    double b;

    public Rectangle_20(double a, double b) {
        this.b = b;
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 2*(a+b);
    }

    @Override
    double calculateArea(){
        return a*b;
    }
}
