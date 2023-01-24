import java.util.Locale;
import java.util.Random;

public class ZAD38 {
    private static Double water = 1.0;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Random random = new Random();

        Thread waterRefiller = new Thread(()->{
            for(int i = 0; i<10; i++) {
                try {
                    Thread.sleep(random.nextInt(15)*1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    water += 1.0;
                    System.out.println("Water refilled! " + water);
                    lock.notify();
                }
            }
        });

        Thread coffeeMaker1 = new Thread(()->{
            for(int i = 0; i<25; i++){
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock) {
                    while (water < 0.2) {
                        System.out.println("Water tank empty!");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    water -= 0.2;
                    System.out.println("(1) Black coffee " + (i+1) +" is ready! " + String.format(Locale.ENGLISH, "%.1f", water));
                }
            }
        });

        Thread coffeeMaker2 = new Thread(()->{
            for(int i = 0; i<25; i++){
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock) {
                    while (water < 0.2) {
                        System.out.println("Water tank empty!");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    water -= 0.2;
                    System.out.println("(2) Black coffee " + (i+1) +" is ready! " + String.format(Locale.ENGLISH, "%.1f", water));
                }
            }
        });

        coffeeMaker1.start();
        coffeeMaker2.start();
        waterRefiller.start();

    }
}
