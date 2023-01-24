public class ZAD8 {
    public static void main(String[] args) {
        Parcel_8 parcel1 = new Parcel_8(70, 70, 50, (float)23.0, false);
        Parcel_8 parcel2 = new Parcel_8(270, 70, 10, 13.0f, true);

        System.out.println(Validator_8.validate(parcel1));
        System.out.println(Validator_8.validate(parcel2));
    }

}
