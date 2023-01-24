public abstract class Shape3D_21 extends Shape_20 implements Fillable_22 {

    abstract double calculateVolume();

    //klasa abstrakcyjna moze posiadac metody z implementacja
    //dodatkowo taka metoda moze odnosic sie do metod abstakcyjnych
    @Override
    public void fill(double value) {
        double volume = this.calculateVolume();

        if(value>volume){
            System.out.println("Too much water");
        } else if(value == volume){
            System.out.println("Exact amount of water");
        } else {
            System.out.println("Not enough water");
        }
    }
}
