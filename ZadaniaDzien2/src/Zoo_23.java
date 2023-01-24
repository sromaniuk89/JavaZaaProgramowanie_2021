import java.util.*;

public class Zoo_23 {
    private Map<String, Integer> animals = new HashMap<>();

    public Integer getNumberOfAllAnimals(){
        //pobieramy wszystkie wartosci z mapy w postaci kolekcji Integerow
        Collection<Integer> integerCollection = animals.values();

        //tworzymy strumien i korzystajac z metody reduce obliczymy sume wartosci
        Optional<Integer> count = integerCollection.stream()
                .reduce((a,b)->a+b); //metoda reduce zwraca optionala

        return count.orElse(0);
    }

    public Map<String, Integer> getAnimalsCount(){
        return animals;
    }

    public Map<String, Integer> getAnimalsCountSorted(){
        return sortMapByValue(animals);
    }

    public void addAnimals(String animal, Integer count){
        if(animals.containsKey(animal)){
            //jezeli dane zwierze juz istnieje w zoo to aktualizujemy ich liczbe
            animals.put(animal, animals.get(animal)+count);
        } else {
            //jezeli danego zwierzaka jeszcze nie ma to wstawiamy nowy wpis
            animals.put(animal, count);
        }
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
