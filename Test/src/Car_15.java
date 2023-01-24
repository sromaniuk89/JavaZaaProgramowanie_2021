public enum Car_15 {
    FERRARI(100, 500),
    PORSCHE(100, 450),
    MERCEDES(90, 400),
    BMW(90, 400),
    OPEL(80, 200),
    FIAT(70, 150),
    TOYOTA(75, 150);

    private final double price;
    private final double power;

    Car_15(double price, double power) {
        this.price = price;
        this.power = power;
    }

    boolean isRegular() {
        if (price < 90) {
            return true;
        } else {
            return false;
        }
    }

    boolean isPremium(){
        return !isRegular();
    }

    boolean isFasterThan(Car_15 car){
        if(this.compareTo(car)>0){
            return true;
        } else{
            return false;
        }
    }


}
