package cz.spsmb.maturity;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    /**
     *

     * @param args
     */
    public static void main(String[] args) {
        excercise1();

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Zadejte slovo");
        String slovo = "";
        slovo = sc.nextLine();
        char[] pismenka = slovo.toCharArray();
        System.out.println();
        for (int i = pismenka.length; i > 0; i--) {
            System.out.print(pismenka[i - 1]);
        }
        String veta = "";
        System.out.println();
        System.out.println();
        System.out.println("Zadejte vetu");
        veta = sc.nextLine();
        System.out.println("Pocet slov: " + veta.split(" ").length);


    }

    /**
     1.	Vytvořte program, kde uživatel zadá na vstupu do konzole číslo a
     * program následně vypíše do konzole trojúhelník. Číslo slouží pro definování
     * výšky trojúhelníku dle následující ukázky. (max 2b)
     *
     */
    private static void excercise1() {
        int height = 0;
        boolean validValue = false;
        while (!validValue){
            try {
                System.out.println("Zadejte výšku trojúhelníku");
                Scanner sc = new Scanner(System.in);
                height = sc.nextInt();
                if (height <= 0){
                    throw new IllegalStateException("Nelze vykreslit strom se zápornou, nebo nulovou velikostí.");
                }
                validValue = true;
            }
            catch (NoSuchElementException | IllegalStateException e){
                System.out.println("chyba: " + e.getMessage());
            }
        }
        for (int i = 0; i <= height; i++) {
            Utils.stars(i);
        }
        for (int i = height - 1; i > 0; i--) {
            Utils.stars(i);
        }


    }
}
