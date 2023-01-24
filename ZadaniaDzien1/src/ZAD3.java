import java.util.HashMap;
import java.util.Map;

public class ZAD3 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("JAVA", 3);
        stringIntegerMap.put("C#", 2);
        stringIntegerMap.put("Python", 1);

        displayMapCollectionInPolish(stringIntegerMap);
    }

    public static void displayMapCollectionInPolish(Map<String, Integer> map){
        int i=0;

        //w tej petli pobieramy kolejne wpisy z naszej mapy czyli pary klucz-wartosc
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            //wypisywanie poszczegolnych elementow
            System.out.print("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue());

            if(++i<map.size()) {//++i najpierw zwiekszamy iterator a potem sprawdzamy czy nie jestesmy na ostatnim wpisie
                System.out.println(",");
            } else {
                System.out.println(".");
            }
        }
    }
}
