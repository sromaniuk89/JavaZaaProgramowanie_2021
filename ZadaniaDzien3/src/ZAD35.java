public class ZAD35 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start(); //uruchamiamy wątek
    }
}
