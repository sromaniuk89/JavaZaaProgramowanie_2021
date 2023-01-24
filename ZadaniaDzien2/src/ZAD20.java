public class ZAD20 {
    public static void main(String[] args) {
        Rectangle_20 rectangle_20 = new Rectangle_20(2.0, 3.0);
        Triangle_20 triangle_20 = new Triangle_20(3.0, 4.0);
        Hexagon_20 hexagon_20 = new Hexagon_20(5.0);

        Shape_20[] shape_20s = new Shape_20[3];

        shape_20s[0]=rectangle_20;
        shape_20s[1]=triangle_20;
        shape_20s[2]=hexagon_20;

        //stosujac typ referencji przechodzimy po obiektach klas ktore dziedzicza po Shape_20
        //nastepnie uzywane sa implementacje metod abstrakcyjnych z danych klas dziedziczacych
        for(Shape_20 s:shape_20s){
            System.out.println(s.calculatePerimeter());
            System.out.println(s.calculateArea());
        }

    }
}
