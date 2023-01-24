public class ZAD27 {
    public static void main(String[] args) {
        //realizacja joinera stricte dla Integer'ow
        Joiner_27<Integer> joiner_27 = new Joiner_27<>("; ");

        System.out.println(joiner_27.join(1,2,3,4));
        System.out.println(joiner_27.joinS(1,2,3,4));

        //Realizacja joinera generycznego (dla roznych typow)
        Joiner_27 joiner_271 = new Joiner_27("; ");

        System.out.println(joiner_271.joinS(2.0, 3.0, 1.0f, "sda"));
    }
}
