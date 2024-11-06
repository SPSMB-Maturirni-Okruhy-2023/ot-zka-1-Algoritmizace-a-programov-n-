package cz.spsmb.cv6;

import java.util.Scanner;

/**
 * 1.	Vytvořte program, ve kterém uživatel zadá tři čísla.
 * Program následně posoudí, jestli všechna čísla jsou stejná nebo ne. (max 1b)
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte 3 cisla");
        Integer prvni = scanner.nextInt();
        Integer druhe = scanner.nextInt();
        Integer treti = scanner.nextInt();

        if (prvni == druhe && druhe == treti){
            System.out.println("Cisla jsou stejna");
        } else {
            System.out.println("Cisla nejsou stejna");
        }

        System.out.println("Zadej postupně čísla o hodnotě 1 nebo 0");
        Integer first = scanner.nextInt();
        Integer second = scanner.nextInt();

        and(first, second);
        or(first, second);
        xor(first, second);



    }

    public static void and (Integer first, Integer second) {
        if (first == 1 && second == 1){
            System.out.println("Výstup pro AND = 1 ");
        }
        else {
            System.out.println("Výstup pro AND = 0 ");
        }
    }

    public static void or (Integer first, Integer second) {
        if (first == 1 || second == 1){
            System.out.println("Výstup pro OR = 1 ");
        }
        else {
            System.out.println("Výstup pro OR = 0 ");
        }
    }

    public static void xor (Integer first, Integer second) {
        if ((first == 1 && second == 0) || (first == 0 && second == 1)){
            System.out.println("Výstup pro XOR = 1 ");
        }
        else {
            System.out.println("Výstup pro XOR = 0 ");
        }
    }
}
