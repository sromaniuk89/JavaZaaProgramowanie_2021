public class ZAD18 {
    public static void main(String[] args) {
        Computer_18 computer_1 = new Computer_18("Intel i3", 8, "RADEON 9200",
                "IBM", "x12");

        Computer_18 computer_2 = new Computer_18("AMD", 16, "GEFORCE 3060",
                "INTEL", "X13");

        Computer_18 computer_3 = new Computer_18("Intel i3", 8, "RADEON 9200",
                "IBM", "x12");
        System.out.println(computer_1);
        System.out.println(computer_2);
        System.out.println(computer_1.hashCode());
        System.out.println(computer_2.hashCode());
        System.out.println(computer_3.hashCode());
        System.out.println(computer_1.equals(computer_3));
    }
}
