public class Display_39 implements Runnable {
    private int id;

    public Display_39(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        ResultsManagement_39 resultsManagement_39 = new ResultsManagement_39();

        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Double result = resultsManagement_39.getResult();

            System.out.println("[Display " + id + "], bestTime: " + result);
        }
    }
}
