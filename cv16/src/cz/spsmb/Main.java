package cz.spsmb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * 1.	Vytvořte ukázku, kde ukážete ošetření tří různých chyb podle vašeho uvážení. (max 3b)
     * 2.	Vytvořte metodu, která bude vyhazovat vlastní výjimku. Tuto metodu potom zavolejte v metodě main. (max 2b)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 10;

        try {
            String pozdrav = null;
            //pozdrav.toUpperCase();

            float[] pole = new float[10];
            //float cisloCoNeexistuje = pole[index];
            int cislo = scanner.nextInt();
         }
        catch (NullPointerException e){
            System.out.println("pozdrav je null");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("index " + index + " neexistuje.");
        }
        catch (InputMismatchException e){
            System.out.println("Nezadal jste číslo");
        }

        try {
            throwErrorMethod();
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }

    public static int throwErrorMethod() throws MyCustomException{
        throw new MyCustomException("Muj popis chyby.....");
    }
}
