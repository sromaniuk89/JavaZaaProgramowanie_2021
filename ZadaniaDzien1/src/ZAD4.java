public class ZAD4 {
    public static void main(String[] args) {
        Storage_4 storage4 = new Storage_4();

        storage4.addToStorage("A", "1");
        storage4.addToStorage("A", "2");
        storage4.addToStorage("A", "3");
        storage4.addToStorage("B", "5");
        storage4.addToStorage("B", "3");
        storage4.addToStorage("B", "3");
        storage4.addToStorage("C", "2");
        storage4.addToStorage("C", "3");

        storage4.printValues("A");

        storage4.findValues("3");
        storage4.findValues("7");


    }
}
