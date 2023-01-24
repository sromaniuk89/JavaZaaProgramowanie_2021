import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Joiner_27<T> {
    private String delimiter;

    public Joiner_27(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T... elements){
        String result=""; //tworzymy pustego Stringa

        int i=0;
        for(T e:elements){ // przechodzimy po kolejnych elementach
            result+=e.toString(); //rozszerzamy string wynikowy
            if(i++<elements.length-1)
                result+=delimiter;
        }

        return result;
    }

    //realizacja na strumieniu
    public String joinS(T... elements){
        return Arrays.asList(elements).stream()
                .map(e->e.toString())
                .collect(Collectors.joining(delimiter));
    }
}
