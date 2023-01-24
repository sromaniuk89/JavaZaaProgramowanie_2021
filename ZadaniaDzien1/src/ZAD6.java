import java.util.TreeMap;

public class ZAD6 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("A", 1);
        treeMap.put("A", 2);
        treeMap.put("A", 3);    //po zauktualizowaniu wartosci pod "A" znajduje się 3 - pierwszy wpis
        treeMap.put("B", 4);
        treeMap.put("C", 7);    //ostatni wpis

        printFirstAndLast(treeMap);
        printFirstAndLastEntry(treeMap);
    }

    public static void printFirstAndLast(TreeMap<String, Integer> treeMap){
        //wypisanie pierwszego elementu
        System.out.println(treeMap.firstEntry().getKey() + ": " + treeMap.firstEntry().getValue());
        //wypisane drugiego elementu
        System.out.println(treeMap.lastEntry().getKey() + ": " + treeMap.lastEntry().getValue());
    }

    public static <K, V> void printFirstAndLastEntry(TreeMap<K, V> treeMap){
        //wypisanie pierwszego elementu
        System.out.println(treeMap.firstEntry().getKey() + ": " + treeMap.firstEntry().getValue());
        //wypisane drugiego elementu
        System.out.println(treeMap.lastEntry().getKey() + ": " + treeMap.lastEntry().getValue());
    }

}
