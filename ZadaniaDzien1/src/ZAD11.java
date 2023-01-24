public class ZAD11 {
    public static void main(String[] args) {
        //tworzymy nowy okrag o srodku w (0; 0)
        Circle_9 circle_9 = new Circle_9(new Point2D_9(5.0, 7.0), new Point2D_9(3.0, 4.0));

        //wyswietlamy parametry
        System.out.println(circle_9.getRadius());
        System.out.println(circle_9.getPerimeter());
        System.out.println(circle_9.getArea());

        circle_9.resize(10);
        //wyswietlamy parametry po przeskalowaniu
        System.out.println(circle_9.getRadius());
        System.out.println(circle_9.getPerimeter());
        System.out.println(circle_9.getArea());
        System.out.println(circle_9.getPoint()); //wyswietlamy gdzie przesunal sie punkt
    }
}
