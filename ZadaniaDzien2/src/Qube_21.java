public class Qube_21 extends Shape3D_21 {

    public Qube_21(double a) {
        this.a = a;
    }

    @Override
    double calculateVolume() {
        return Math.pow(a, 3.0); //a^3
    }

    @Override
    double calculatePerimeter() {
        return 12*a;
    }

    @Override
    double calculateArea() {
        return 6*Math.pow(a, 2.0);//6*a^2
    }
}
