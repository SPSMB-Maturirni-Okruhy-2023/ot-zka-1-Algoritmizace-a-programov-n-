package cz.spsmb.maturitaFormalita;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SimpleMonth leden = SimpleMonth.LEDEN;
        leden.getDays();
        for (int i = 0; i < SimpleMonth.values().length; i++) {
            System.out.println(SimpleMonth.values()[i] + " ma " + SimpleMonth.values()[i].getDays() + " dni");
            SimpleMonth.values()[i].getDescription();
        }


        /**
         * Zadání
         * Vytvořte dvourozměrné pole int[10][10];
         * Pole projděte prvek po prvku a najděte první prvočíslo.
         * Pokud se v poli provočíslo nenaléza vypište hlášku "žádné prvočíslo."
         *
         */
        Random random = new Random();
        Integer[][] integers = new Integer[10][10];
        for (int i = 0; i < integers.length;i++){
            for (int j = 0; j < integers[0].length; j++) {
                integers[i][j] = random.nextInt(100);
            }
        }

        outer:
        for (int i = 0; i < integers.length;i++){
            for (int j = 0; j < integers[0].length; j++) {
                int cislo = integers[i][j];
                if (isPrimeNumber(cislo)){
                    System.out.println(cislo + " je prvočíslo.");
                    break outer;
                }
            }
            System.out.println("žádné prvočíslo.");
        }
    }

    /**
     * Metoda ověří, pokud je zadané číslo porvočíslo.
     * @param number číslo
     * @return boolean true pokud je porvočíslo, jinak false
     */
    public static boolean isPrimeNumber(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
