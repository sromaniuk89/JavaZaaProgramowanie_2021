public class ZAD24 {
    public static void main(String[] args) {
        Basket_24 basket_24 = new Basket_24();

        try{basket_24.removeFromBasket();}
        catch (RuntimeException e){
            e.printStackTrace();
        }

        for(int i = 0; i<12; i++)
            basket_24.addToBasket();

        //tekst nie zostanie wyswietlony poniewaz poprzedni wyjatek nie jest obslugiwany
        System.out.println("test");
    }
}
