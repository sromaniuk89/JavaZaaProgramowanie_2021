import java.util.List;
import java.util.Objects;

public class Car_12 implements Comparable<Car_12>{
    private String name;
    private String model;
    private Integer price;
    private Integer productionYear;
    private List<Manufacturer_12> manufacturersList;
    private EngineType_12 engineType;

    public Car_12(String name, String model, Integer price, Integer productionYear, List<Manufacturer_12> manufacturersList, EngineType_12 engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturersList = manufacturersList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public List<Manufacturer_12> getManufacturersList() {
        return manufacturersList;
    }

    public EngineType_12 getEngineType() {
        return engineType;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car_12 car_12 = (Car_12) o;
        return Objects.equals(name, car_12.name) &&
                Objects.equals(model, car_12.model) &&
                Objects.equals(price, car_12.price) &&
                Objects.equals(productionYear, car_12.productionYear) &&
                Objects.equals(manufacturersList, car_12.manufacturersList) &&
                engineType == car_12.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, productionYear, manufacturersList, engineType);
    }

    @Override
    public String toString() {
        return "Car_12{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionYear=" + productionYear +
                ", manufacturersList=" + manufacturersList +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public int compareTo(Car_12 o) {
        //najpierw sprawdzamy nazwe, jesli jest taka sama to potem sprawdzamy model
        if(this.name.compareTo(o.getName())==0){
            return this.model.compareTo(o.getModel());
        } else {
            return this.name.compareTo(o.getName());
        }
    }
}
