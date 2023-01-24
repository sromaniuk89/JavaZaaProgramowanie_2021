public class Basket_25 {
    private int i;

    public Basket_25() {
        this.i=0;
    }

    //throws przenosi odpowiedzialnosc za obsluzenie danego wyjatku
    //w miejsce gdzie ta metoda jest wywolywana
    public void addToBasket() throws BasketFullExceptionChecked{
        if(i<10) {
            this.i++;
        } else {
            throw new BasketFullExceptionChecked("Basket is already full");
        }
    }

    public void removeFromBasket() throws BasketEmptyExceptionChecked{
        if(i>0){
            this.i--;
        } else {
            throw new BasketEmptyExceptionChecked("Basket is empty");
        }
    }
}
