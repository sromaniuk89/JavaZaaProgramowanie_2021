public class ZAD36 {
    private static Thread thread1, thread2;

    public static void main(String[] args) {
        thread1 = new Thread(new ThreadPlaygroundRunnable("T1"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("T2"));

        //Uruchamiajac metode run na obiektach implementujacych interfejs runnable nie uzyskujemy efektu wielowatkowosci
        //new ThreadPlaygroundRunnable("T1").run();
        //new ThreadPlaygroundRunnable("T2").run();

        thread1.start();
        thread2.start();
    }
}
