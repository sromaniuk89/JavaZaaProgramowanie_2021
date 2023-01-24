public class ZAD15 {
    public static void main(String[] args) {
        System.out.println(Car_15.FERRARI.isPremium());
        System.out.println(Car_15.OPEL.isRegular());
        System.out.println(Car_15.TOYOTA.isFasterThan(Car_15.OPEL)); //true
        System.out.println(Car_15.FERRARI.isFasterThan(Car_15.OPEL)); //false

        //standardowa implementacja interfejsu comparable sprawdza kolejnosc wystapien elementow
        //w enumie. elementy na koncu maja wieksza wartosc niz na poczatku
    }
}
