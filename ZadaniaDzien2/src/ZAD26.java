import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//zalozenia:
//zakladamy ze metody zawsze beda przyjmowac zbior producentow
public class ZAD26 {
    //2
    public interface IGetAllCars{
        List<Car> get(Set<Manufacturer> manufacturers);
    }

    public static void main(String[] args) {

        //implementacja interfejsu poprzez lambde dla zadania
        //2
        IGetAllCars iGetAllCars = mnf -> mnf.stream()
                .flatMap(m->m.models.stream()) //mamy teraz w strumieniu modele
                .flatMap(m->m.cars.stream()) //teraz dostalismy az do samochodow
                .collect(Collectors.toList());

        //System.out.println(iGetAllCars.get()); //przykladowe uzycie

    }

    //1
    public List<Model> getAllModels(Set<Manufacturer> manufacturers){
        //najpierw tworzymy strumien, teraz w strumieniu mamy poszczegolnych producentow
        return manufacturers.stream()
                .flatMap(m->m.models.stream()) //flatMap laczy strumienie w jeden strumien
                .collect(Collectors.toList()); //składamy modele do listy, ktora jest zwracana z metody
    }

    //2
    public List<Car> getAllCars(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .flatMap(m->m.models.stream()) //mamy teraz w strumieniu modele
                .flatMap(m->m.cars.stream()) //teraz dostalismy az do samochodow
                .collect(Collectors.toList());
    }

    //3
    public List<String> getAllManufacturersName(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .map(m->m.name) //pobieramy nazwe producenta
                .collect(Collectors.toList());
    }

    //4
    public List<Integer> getAllManufacturersCreationYear(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .map(m->m.yearOfCreation) //pobieramy rok powstania producenta
                .collect(Collectors.toList());
    }

    //5
    public List<String> getAllModelsName(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli
                .map(m->m.name) //pobieramy nazwe modelu
                .collect(Collectors.toList());
    }

    //6
    public List<Integer> getAllModelsProductionStartYear(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli
                .map(m->m.productionStartYear) //pobieramy rok startu produkcji modeli
                .collect(Collectors.toList());
    }

    //7
    public List<String> getAllCarsName(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli [Manufacturer -> Model]
                .flatMap(m->m.cars.stream()) //dostajemy sie do samochodow [Model -> Car]
                .map(c->c.name) //pobieramy nazwe samochodu [Car -> String]
                .collect(Collectors.toList());
    }

    //8
    public List<String> getAllCarsDescription(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli [Manufacturer -> Model]
                .flatMap(m->m.cars.stream()) //dostajemy sie do samochodow [Model -> Car]
                .map(c->c.description) //pobieramy opis samochodu [Car -> String]
                .collect(Collectors.toList());
    }

    //9
    public List<Model> getAllModelsWithEvenProductionStartYear(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli
                //reszta z dzielenia roku przez 2 powinna wynosic 0
                //wtedy ten rok jest parzysty
                //metoda filter pozostawi w strumieniu tylko te elementy(modele) ktore spelniaja warunek
                //pozostale elementy zostana odrzucone
                .filter(m->m.productionStartYear%2==0)
                .collect(Collectors.toList());
    }

    //10
    public List<Car> getAllCarsOfManufacturersWithEvenCreationYear(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                //uzyskujemy tylko producentow z parzystym rokiem zalozenia
                .filter(m->m.yearOfCreation%2==0)
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli
                .flatMap(m->m.cars.stream()) //dostajemy sie do samochodow
                .collect(Collectors.toList());
    }

    //11
    public List<Car> getAllCarsOfModelsEvenProductionStartYearManufacturersWithOddCreationYear(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                //uzyskujemy tylko producentow z nieparzystym rokiem zalozenia
                .filter(m->m.yearOfCreation%2==1)
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli
                //uzyskujemy tylko modele z parzystym rokiem startu produkcji
                .filter(m->m.productionStartYear%2==0)
                .flatMap(m->m.cars.stream()) //dostajemy sie do samochodow
                .collect(Collectors.toList()); //zamieniamy strumien na liste samochodow
    }

    //12
    public List<Car> getAllCarsWithConditionsFromTask12(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                //uzyskujemy tylko producentow z parzystym rokiem zalozenia
                .filter(m->m.yearOfCreation%2==0)
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli
                //uzyskujemy tylko modele z nieparzystym rokiem startu produkcji
                .filter(m->m.productionStartYear%2==1)
                .flatMap(m->m.cars.stream()) //dostajemy sie do samochodow
                .filter(c->c.carType.equals(CarType.CABRIO)) //pozostawiamy tylko samochody typu CABRIO
                .collect(Collectors.toList()); //zamieniamy strumien na liste samochodow
    }

    //13
    public List<Car> getAllCarsWithConditionsFromTask13(Set<Manufacturer> manufacturers){
        return manufacturers.stream()
                //uzyskujemy tylko producentow z rokiem zalozenia <1919
                .filter(m->m.yearOfCreation<1919)
                .flatMap(m->m.models.stream()) //dostajemy sie do modeli
                //uzyskujemy tylko modele z roku >2019
                .filter(m->m.productionStartYear>2019)
                .flatMap(m->m.cars.stream()) //dostajemy sie do samochodow
                .filter(c->c.carType.equals(CarType.SEDAN)) //pozostawiamy tylko samochody typu CABRIO
                .collect(Collectors.toList()); //zamieniamy strumien na liste samochodow
    }
}
