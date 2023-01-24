import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ZAD32 {
    public static void main(String[] args) {
        String outPath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java zaawansowana - programowanie\\zad32.txt";

        Car car1 = new Car("LAGUNA", "RED", CarType.CABRIO);
        Car car2 = new Car("IBIZA", "YELLOW", CarType.COUPE);

        List<Car> carList=new LinkedList<>();
        carList.add(car1);
        carList.add(car2);

        try(FileOutputStream fileOutputStream = new FileOutputStream(new File(outPath));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){

            //zapisanie obiektu do strumienia
            //obiekty ktore chcemy zapisywac do strumienia musza miec implementacje interfejsu Serializable
            objectOutputStream.writeObject(carList);

        } catch (Exception e){
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream(new File(outPath));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

            List<Car> carListRead = (LinkedList<Car>) objectInputStream.readObject();

            System.out.println(carListRead);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
