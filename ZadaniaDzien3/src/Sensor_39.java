import java.util.Random;

public class Sensor_39 implements Runnable {
    @Override
    public void run() {
        ResultsManagement_39 resultsManagement_39 = new ResultsManagement_39();
        Random random = new Random();

        while (true) {
            Double actualValue = resultsManagement_39.getResult();

            try {
                //Thread.sleep(random.nextInt(3000));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //Double newValue = actualValue * (random.nextDouble());
            Double newValue = actualValue - random.nextDouble();

            resultsManagement_39.updateResult(actualValue, newValue);
        }
    }
}
