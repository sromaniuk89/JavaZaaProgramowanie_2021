public class ZAD23 {
    public static void main(String[] args) {
        Zoo_23 zoo_23 = new Zoo_23();

        zoo_23.addAnimals("Cow", 3);
        zoo_23.addAnimals("Wisent", 5);
        zoo_23.addAnimals("Parrot", 2);

        System.out.println(zoo_23.getNumberOfAllAnimals());
        System.out.println(zoo_23.getAnimalsCount());
        System.out.println(zoo_23.getAnimalsCountSorted());
    }
}
