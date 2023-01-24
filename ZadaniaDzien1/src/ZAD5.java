public class ZAD5 {
    public static void main(String[] args) {
        SDAHashSet_5 sdaHashSet_5 = new SDAHashSet_5<String>();

        System.out.println(sdaHashSet_5.add("A"));
        System.out.println(sdaHashSet_5.add("A"));
        System.out.println(sdaHashSet_5.add("B"));
        System.out.println(sdaHashSet_5.add("C"));
        System.out.println(sdaHashSet_5.size());
        System.out.println(sdaHashSet_5.remove("A"));
        System.out.println(sdaHashSet_5.remove("A"));
        System.out.println(sdaHashSet_5.contains("B"));
        sdaHashSet_5.clear();
        System.out.println(sdaHashSet_5.size());
    }
}
