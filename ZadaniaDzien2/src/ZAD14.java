import java.util.*;
import java.util.stream.DoubleStream;

public class ZAD14 {
    public static void main(String[] args) {
        Double[] doubles = new Double[100000]; //tworzymy nowa tablice

        Random random = new Random();

        for(int i=0; i<doubles.length; i++){
            //zeby uzyskac liczby z dokladnoscia do 5 miejsc po przecinku mnozymy raz 10^5
            //zaokraglamy a nastepnie dzielimy przez 10^5
            doubles[i]=Math.round(100000*random.nextDouble())/100000.0;
        }

        //czesciowo wyswietlamy co znajduje w wygenerowanej tablicy
        for (int i = 0; i < 500; i++) {
            System.out.println(doubles[i]);
        }

        //1
        System.out.println("1: "+doubles.length);
        System.out.println("1: "+findUniqueElements(doubles).size());
        System.out.println("1: "+findUniqueElementsV2(doubles).size());

        //2
        System.out.println("2: "+findRepeats(doubles).size());

        //3
        System.out.println("3: "+find25MostFrequentRepeats(doubles).size());
    }

    //1
    private static List<Double> findUniqueElements(Double[] doubles){
        List<Double> results = new LinkedList<>(); //tworzymy nowa pusta liste

        Arrays.sort(doubles);

        for (int i=0; i<doubles.length-2; i++){
            if(!doubles[i].equals(doubles[i+1])){//sprawdzamy czy elementy się nie powtarzaja
                results.add(doubles[i]);
            }
        }

        //jeszcze nalezy dodac element ostatni
        results.add(doubles[doubles.length-1]);

        return results;
    }

    //1
    private static List<Double> findUniqueElementsV2(Double[] doubles){
        Set<Double> doubleSet = new HashSet<>(Arrays.asList(doubles));

        List<Double> results = new LinkedList<>(doubleSet);

//        for(Double d: doubles){
//            doubleSet.add(d); //dodajemy do seta, automatycznie elementy ktore sie powtarzaja zostana pominiete
//        }
//
//        for(Double d: doubleSet){
//            results.add(d); //zamieniamy na liste, bo mamy wynik w takiej postaci zwrocic
//        }

        return results;
    }

    //2
    private static List<Double> findRepeats(Double[] doubles){
        List<Double> results = new LinkedList<>(); //tworzymy nowa pusta liste

        Arrays.sort(doubles);

        //sprawdzamy najpierw element pierwszy
        if(doubles[0].equals(doubles[1]))
            results.add(doubles[0]);

        //nastepnie przeszukujemy reszte tablicy
        for(int i=1; i<doubles.length-2; i++){
            //warunek ktory sprawdza czy dany element jest taki sam jak nastepny
            //jednoczesnie sprawdzamy czy nie jest taki sam jak poprzedni celem unikniecia powtorek
            if(doubles[i].equals(doubles[i+1])&&!doubles[i].equals(doubles[i-1])){
                results.add(doubles[i]);
            }
        }

        return results;
    }

    //3
    private static List<Double> find25MostFrequentRepeats(Double[] doubles){
        Map<Double, Integer> uniqueElements = new HashMap<>();
        List<Double> result = new LinkedList<>();

        for(Double d: doubles){
            if(uniqueElements.containsKey(d)){ //sprawdzamy czy w mapie znajduje sie juz dana wartosc
                //pobieramy liczbe wystapien danej wartosci z mapy a nastepnie zwiekszamy ja o 1
                //wstawiajac do mapy nowa wartosc pod dany klucz ktory juz w tej mapie sie znajduje
                //w mapie dalej bedzie tylko jeden dany unikalny klucz ale wartosc tego klucza zostanie zaktualizowana
                uniqueElements.put(d, uniqueElements.get(d)+1);
            } else {
                //jezeli danego klucza w mapie jeszcze nie ma to dodajemy nowa pare o wartosci 1 powtorzenia.
                uniqueElements.put(d, 1);
            }
        }

        uniqueElements=sortMapByValue(uniqueElements);

        int i=0;
        //w tej petli pobieramy teraz 25 najczesciej powtarzajacych sie elementow
        for (Map.Entry<Double, Integer> entry : uniqueElements.entrySet()){
            if(i++<25){
                //wyswietlamy elementy wraz z liczba powtorzen
                //System.out.println(entry.getKey()+": "+entry.getValue());
                result.add(entry.getKey()); //dodajemy wyniki do listy
            } else {
                break;
            }
        }

        return result;
    }

    private static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map){
        //zamieniamy mape na liste wpisow
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        //dokonujemy sortowania wpisow porownujac po wartosciach
        //wstawiamy reverseOrder zeby posortowac od najwiekszych do najmniejszych
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<K, V> result = new LinkedHashMap<>(); //tworzymy nowa mape

        for (Map.Entry<K, V> entry: list){
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
