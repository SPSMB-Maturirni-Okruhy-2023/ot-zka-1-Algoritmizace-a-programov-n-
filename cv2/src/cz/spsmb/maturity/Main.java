package cz.spsmb.maturity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        boolean susenkaCheck = false;
        int[] cislicka = new int[10];
        while(susenkaCheck == false){
            String text = sc.nextLine();
            if(text.equals("susenka")){
                susenkaCheck = true;
                System.out.println("konec");
                return;
            }
            else{
                String[] cislatext = text.split(",");
                if(cislatext.length != 10){
                    System.out.println("ses tadeas");
                    return;
                }
                for (int i = 0; i < cislatext.length; i++) {
                    cislicka[i] = Integer.parseInt(cislatext[i]);
                }
            }
            for (int i = 0; i < cislicka.length; i++) {
                if(cislicka[i] % 2 == 0){
                    System.out.println(cislicka[i] + " je cislo sude");
                }
                else{
                    System.out.println(cislicka[i] + " je cislo liche");
                }
            }
        }*/

        /*Scanner sc2 = new Scanner(System.in);

        String text;
        text = sc2.nextLine();

        char[] chartext = text.toCharArray();
        for (int i = 0; i < chartext.length; i++) {
            if(i % 2 != 0){
                chartext[i] = Character.toUpperCase(chartext[i]);
            }else{
                chartext[i] = Character.toLowerCase(chartext[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < chartext.length; i++) {
            System.out.print(chartext[i]);
        }*/
        Scanner sc3 = new Scanner(System.in);

        String cislo1 = "";
        String cislo2 = "";

        System.out.println("Napiste cislo");
        cislo1 = sc3.nextLine();
        System.out.println("Napiste cislo2");
        cislo2 = sc3.nextLine();
        System.out.println(Integer.parseInt(cislo1) + Integer.parseInt(cislo2));
    }
}
