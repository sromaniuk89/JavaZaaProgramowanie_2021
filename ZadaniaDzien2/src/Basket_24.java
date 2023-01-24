public class Basket_24 {
    private int i;

    public Basket_24() {
        this.i=0;
    }

    public void addToBasket(){
        if(i<10) {
            this.i++;
        } else {
            throw new BasketFullException("Basket is already full");
        }
    }

    public void removeFromBasket(){
        if(i>0){
            this.i--;
        } else {
            throw new BasketEmptyException("Basket is empty");
        }
    }
}
