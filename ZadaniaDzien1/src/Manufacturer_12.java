import java.util.Objects;

public class Manufacturer_12 {
    private String name; //nazwa producenta
    private String countryOfOrigin; //kraj pochodzenia
    private Integer yearOfEstablishment; //rok zalozenia

    public Manufacturer_12(String name, String countryOfOrigin, Integer yearOfEstablishment) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public Integer getYearOfEstablishment() {
        return yearOfEstablishment;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; //jezeli adresy z obu referencji sa takie same to wiadomo ze to ten sam obiekt
//        //jezeli obiekt jest nullem lub
//        //jezeli nazwy obiektow sa rozne to te obiekty nie sa takie same
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Manufacturer_12 that = (Manufacturer_12) obj;
//
//        return Objects.equals(this.name, that.name) &&
//                Objects.equals(this.countryOfOrigin, that.countryOfOrigin) &&
//                Objects.equals(this.yearOfEstablishment, that.yearOfEstablishment);
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer_12 that = (Manufacturer_12) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(countryOfOrigin, that.countryOfOrigin) &&
                Objects.equals(yearOfEstablishment, that.yearOfEstablishment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countryOfOrigin, yearOfEstablishment);
    }

    @Override
    public String toString() {
        return "Manufacturer_12{" +
                "name='" + name + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                '}';
    }
}
