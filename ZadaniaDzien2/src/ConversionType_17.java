public enum ConversionType_17 {
    METERS_TO_YARDS(x->x/0.9144),
    YARDS_TO_METERS(x->x*0.9144),
    CENTIMETERS_TO_INCHES(x->x/2.54),
    INCHES_TO_CENTIMETERS(x->x*2.54),
    KILOMETERS_TO_MILES(x->x/1.6093),
    MILES_TO_KILOMETERS(x->x*1.6093);

    public final Converter_17 converter_17; //interfejs funkcyjny

    ConversionType_17(Converter_17 converter_17) {
        this.converter_17 = converter_17;
    }
}
