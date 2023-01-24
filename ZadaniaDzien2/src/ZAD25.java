public class ZAD25 {
    public static void main(String[] args) {
        Basket_25 basket_25 = new Basket_25();

        //dzieki formule try-catch nasz program moze kontynuowac prace mimo wystapienia wyjatku
        try{basket_25.removeFromBasket();}
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            for (int i = 0; i < 12; i++) {
                basket_25.addToBasket();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        //tekst zostanie wyswietlony pomimo tego ze wyjatki zostaly rzucone
        System.out.println("test");
    }
}
