import java.util.Objects;

public class Laptop_19 extends Computer_18 {
    Integer battery;

    public Laptop_19(String processor, Integer ram, String graphicsCard, String manufacturer, String model, Integer battery) {
        super(processor, ram, graphicsCard, manufacturer, model);
        this.battery = battery;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop_19{" +
                "battery=" + battery +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop_19 laptop_19 = (Laptop_19) o;
        return Objects.equals(battery, laptop_19.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }


}
