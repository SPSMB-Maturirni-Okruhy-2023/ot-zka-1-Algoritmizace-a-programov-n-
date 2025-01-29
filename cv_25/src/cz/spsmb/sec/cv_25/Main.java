package cz.spsmb.sec.cv_25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CountThread countThread = new CountThread();
        countThread.start();
        do {
            System.out.println("Zadej číslo");
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = countThread.getCounter();
            System.out.println("Součet je: " + (number1 + number2));
        }
        while (true);
    }
}
