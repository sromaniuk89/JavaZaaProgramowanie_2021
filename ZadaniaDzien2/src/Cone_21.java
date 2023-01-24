public class Cone_21 extends Shape3D_21{
    double h;

    public Cone_21(double r, double h) {
        this.a = r;
        this.h = h;
    }

    @Override
    double calculateVolume() {
        return Math.PI*Math.pow(a, 2.0)*h/3.0;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*a; //2*PI*r
    }

    @Override
    double calculateArea() {
        //pole podstawy + pole boczne -> PI*r^2+PI*r*l
        return Math.PI*Math.pow(a, 2.0)+Math.PI*a*Math.sqrt(Math.pow(a, 2.0)+Math.pow(h, 2.0));
    }
}
