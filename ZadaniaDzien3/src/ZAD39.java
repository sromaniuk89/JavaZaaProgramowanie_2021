import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZAD39 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new Display_39(1));
        executorService.execute(new Display_39(2));

        for(int i =0; i<10; i++)
            executorService.execute(new Sensor_39());


    }
}
