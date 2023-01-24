public class ZAD10 {
    public static void main(String[] args) {
        //tworzymy nowy okrag w punkcie -3; -3
        Circle_9 circle_9 = new Circle_9(new Point2D_9(-3.0, -3.0), new Point2D_9(0.0, 1.0));

        //wypisujemy parametry okregu
        System.out.println(circle_9.getRadius());
        System.out.println(circle_9.getPerimeter());
        System.out.println(circle_9.getArea());

        //tworzymy nowy wektor przesuniecia
        MoveDirection_10 moveDirection_10 = new MoveDirection_10(3.0, 3.0);

        circle_9.move(moveDirection_10); //przesuwamy okrag i sprawdzamy jego parametry
        System.out.println(circle_9.getRadius());
        System.out.println(circle_9.getPerimeter());
        System.out.println(circle_9.getArea());

        System.out.println(circle_9.getCenter());
        System.out.println(circle_9.getPoint());
    }
}
