import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZAD1 {
    public static void main(String[] args) {
        List<String> exampleList = Arrays.asList("abc", "Xyz", "xyz", "mnp", "dag");

        List<String> resultList = stringListSort(exampleList);

        System.out.println(resultList);
    }

    public static List<String> stringListSort(List<String> list){
        //Collections.sort(list, Collections.reverseOrder());

        list.sort(Collections.reverseOrder());

        return list;
    }
}
