import java.util.function.Predicate;

public class ZAD29 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,11};

        //wyrazenie lambda mozna rowniez oczywiscie zapisywac w wielu liniach
        //w takim przypadku uzywamy klamr
        //deklarujac wyrazenie lambda automatycznie implementacja trafia do metody test z Predicate
        Predicate<Integer> predicate = e -> {
            if(e%3==0||e%4==0){
                return true;
            } else {
                return false;
            }
        };

        System.out.println(partOf(integers, predicate)+" %");
    }


    //tworzymy metode generyczna parametryzowana T

    private static <T> Double partOf(T[] tab, Predicate<T> f){
        int i=0; //posluzy nam do zliczania ile elementow z tablicy wejsciowej spelnia ten warunek

        for(T e:tab){
            if(f.test(e)){ //testujemy czy dany element spelnia podana funkcje sprawdzajaca
                i++; //zwiekszamy i gdy warunek jest spelniony
            }
        }

        return (double)i/tab.length*100.0;
    }
}
