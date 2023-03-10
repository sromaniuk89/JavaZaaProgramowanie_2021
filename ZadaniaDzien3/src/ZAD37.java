import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ZAD37 {
    public static void main(String[] args) {
        //tworzymy pule 5 watkow
        Executor executor = Executors.newFixedThreadPool(5);

        //nastepnie w danej puli wykonywana jest praca przez okreslona liczbe obiektow(10)
        //z zastrzezeniem ze w danej chwili uruchomionych jest okreslona pula watkow (5)
        //czyli po zakonczeniu dzialania danych watkow rozpoczynane sa nastepne watki w sposob automatyczny
        for(int i=0; i<10; i++){
            executor.execute(new ThreadPlaygroundRunnable("R:"+i));
        }

        System.out.println("test");
    }
}
