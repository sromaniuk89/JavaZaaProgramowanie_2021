import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ZAD2 {
    public static void main(String[] args) {
        List<String> exampleList = Arrays.asList("abc", "Yyz", "xyz", "mnp", "dag");

        List<String> resultList = stringListSort(exampleList);

        System.out.println(resultList);
    }

    public static List<String> stringListSort(List<String> list){
        List<String> result = list.stream()
                .map(String::toLowerCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        return result;
    }
}
