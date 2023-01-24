public class ZAD17 {
    public static void main(String[] args) {
        MeasurementConverter measurementConverter= new MeasurementConverter();

        System.out.println(measurementConverter.convert(10, ConversionType_17.M_TO_K));

        System.out.println(MeasurementConverter.convert(10, ConversionType_17.M_TO_K));
    }
}
