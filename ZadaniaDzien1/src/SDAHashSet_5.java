import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SDAHashSet_5<E> extends AbstractSet<E> implements Set<E>, Serializable {
    private HashMap<E, Object> map;

    public SDAHashSet_5(){ //konstruktor
        map = new HashMap<E, Object>();
    }

    private static final Object OBECNY = new Object(); //tworzony tylko jako swoisty "znacznik"

    public boolean add(E e){
        return map.put(e, OBECNY)==null; //jesli dany element sie znajdowal w mapie to zwrocony zostanie false
    }

    public boolean remove(Object o){
        return map.remove(o)==OBECNY;   //jesli dany element byl w mapie to zwrocony zostanie true
    }

    public int size(){
        return map.size();  //zwracamy rozmiar mapy, uwzglednia liczbe kluczy
    }

    public boolean contains(Object o){
        return map.containsKey(o);  //sprawdzamy czy dany element znajduje sie w mapie
    }

    public void clear(){
        map.clear();    //czyszczenie zbioru polega na czyszczeniu mapy
    }

    public Iterator<E> iterator(){
        return map.keySet().iterator();
    }
}
