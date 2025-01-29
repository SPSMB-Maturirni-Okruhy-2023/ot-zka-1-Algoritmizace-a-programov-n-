package cz.spsmb.sec.cv_25;

public class CountThread extends Thread {
    int counter = 0;
    @Override
    public void run() {
        while (true){
            counter++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
