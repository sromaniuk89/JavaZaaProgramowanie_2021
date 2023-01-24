public interface Validator_8 {

    public static boolean validate(Parcel_8 parcel_8){
        boolean result = true;

        if(parcel_8.getxLength() + parcel_8.getyLength() + parcel_8.getzLength() > 300){
            System.out.println("Parcel is too big");
            result = false;
        }

        if(parcel_8.getxLength()< 30 || parcel_8.getyLength()<30 || parcel_8.getzLength()<30){
            System.out.println("One of the parcel's dimensions is too small");
            result = false;
        }

        if((parcel_8.getWeight()>30.0 && !parcel_8.isExpress()) || (parcel_8.getWeight()>15.0 && parcel_8.isExpress())){
            System.out.println("Parcel is too heavy");
            result = false;
        }

        return result;
    }
}
