import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZAD13 {
    public static void main(String[] args) {
        CarService_13 carService13 = new CarService_13();
        Manufacturer_12 mfr1 = new Manufacturer_12("Renault", "France", 1899);
        Manufacturer_12 mfr2 = new Manufacturer_12("Fiat", "Italy", 1899);
        Manufacturer_12 mfr3 = new Manufacturer_12("Ford", "USA", 1903);
        Manufacturer_12 mfr4 = new Manufacturer_12("Bosch", "Germany", 1907);
        Manufacturer_12 mfr5 = new Manufacturer_12("Hutchinson", "France", 1934);
        Manufacturer_12 mfr6 = new Manufacturer_12("BMW", "Germany", 1899);

        carService13.addCar(new Car_12("Renault","Megane",10000, 2015, Arrays.asList(mfr1, mfr4, mfr5), EngineType_12.S4));
        carService13.addCar(new Car_12("Fiat", "Punto", 3000, 2005, Arrays.asList(mfr2, mfr4), EngineType_12.S3));
        carService13.addCar(new Car_12("Ford", "Mustang", 100000, 2018, Arrays.asList(mfr3, mfr4), EngineType_12.V12));
        carService13.addCar(new Car_12("Lamborghini", "Aventador", 500000, 2020, Arrays.asList(mfr2, mfr4, mfr5), EngineType_12.V12));
        carService13.addCar(new Car_12("Ford", "Mustang", 75000, 2017, Arrays.asList(mfr3, mfr4), EngineType_12.V8));
        carService13.addCar(new Car_12("Ford", "Mustang", 50000, 2015, Arrays.asList(mfr3, mfr4), EngineType_12.V6));
        carService13.addCar(new Car_12("Renault","Alpine",30000, 1983, Arrays.asList(mfr1, mfr4, mfr5), EngineType_12.V6));
        carService13.addCar(new Car_12("Renault","Clio",50000, 2005, Arrays.asList(mfr1, mfr4, mfr5), EngineType_12.V6));
        carService13.addCar(new Car_12("BMW", "335", 3000, 1995, Arrays.asList(mfr6, mfr4), EngineType_12.S6));

        //ZAD13/4
        System.out.println("ZAD13/4");
        for(Car_12 car: carService13.getV12Cars())
            System.out.println(car);

        //ZAD13/5
        System.out.println("ZAD13/5");
        for(Car_12 car: carService13.getCarsMadeBefore1999())
            System.out.println(car);

        //ZAD13/6
        System.out.println("ZAD13/6");
        System.out.println(carService13.getMostExpensiveCar());

        //ZAD13/7
        System.out.println("ZAD13/7");
        System.out.println(carService13.getLeastExpensiveCar());

        //ZAD13/8
        System.out.println("ZAD13/8");
        System.out.println(carService13.getCarWithAtLeast3Manufacturers());

        //ZAD13/9
        System.out.println("ZAD13/9");
        for(Car_12 car: carService13.sortCarList("MALEJACO"))
            System.out.println(car);

        //ZAD13/10
        System.out.println("ZAD13/10");
        Car_12 carLAMBO = new Car_12("Lamborghini", "Aventador", 500000, 2020, Arrays.asList(mfr2, mfr4, mfr5), EngineType_12.V12);
        System.out.println(carService13.containsCar(carLAMBO));

        //ZAD13/11
        System.out.println("ZAD13/11");
        for(Car_12 car: carService13.getCarsMadeBySpecificManufacturer(mfr1))
            System.out.println(car);

        //ZAD13/12
        System.out.println("ZAD13/12");
        for(Car_12 car: carService13.getCarsMadeBySpecificManufacturerOfYear("<", 1900))
            System.out.println(car);
    }

}
