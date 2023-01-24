public enum ConversionType_17 {
    METERS_TO_YARDS(x->x/0.9144),
    YARDS_TO_METERS(x->x*0.9144),
    C_TO_I(x->x/2.54),
    I_TO_C(x->x*2.54),
    K_TO_M(x->x/1.6093),
    M_TO_K(x->x*1.6093);

    public final Converter_17 converter_17;

    ConversionType_17(Converter_17 converter_17) {
        this.converter_17 = converter_17;
    }
}
