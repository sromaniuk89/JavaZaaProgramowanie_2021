public enum Car_15 {
    FERRARI(100, 500),
    PORSCHE(100, 450),
    MERCEDES(90, 400),
    BMW(90, 400),
    OPEL(80, 200),
    FIAT(70, 150),
    TOYOTA(75, 150);

    private final int price; //pole ktore nie moze zostac zmienione (final)
    private final double power; //musi zostac zainicjalizowane w konstruktorze

    Car_15(int price, double power) {
        this.price = price;
        this.power = power;
    }

    boolean isRegular(){
        if(price<90){
            return true;
        } else {
            return false;
        }
    }

    boolean isPremium(){
        return !isRegular();
    }

    boolean isFasterThan(Car_15 car_15){
        if(this.compareTo(car_15)>0){ //wszystkie enumy implementuja interfejs comparable
            return true;
        } else {
            return false;
        }
    }
}
