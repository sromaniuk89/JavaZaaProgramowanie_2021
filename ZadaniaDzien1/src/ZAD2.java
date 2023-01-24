import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ZAD2 {
    public static void main(String[] args) {
        List<String> exampleList = Arrays.asList("abc", "ZYX", "xyz", "mnp", "dag"); //przykładowa lista

        List<String> results = stringListSortCaseInsensitive(exampleList);

        System.out.println(results);
    }

    public static List<String> stringListSortCaseInsensitive(List<String> list) {
//        List<String> stringList = new LinkedList<>(); //tworzenie nowej listy
//
//        //w petli z listy pobierac bedziemy kolejne stringi, a nastepnie zamieniac je na male litery
//        //i dodajemy do nowej listy
//        for (String s : list) {
//            stringList.add(s.toLowerCase());
//        }

        //sortowanie w odwrotnej kolejnosci
        //Collections.sort(stringList, Collections.reverseOrder());
        Collections.sort(list, (x,y)->y.toLowerCase().compareTo(x.toLowerCase()));

        return list;
    }


}
