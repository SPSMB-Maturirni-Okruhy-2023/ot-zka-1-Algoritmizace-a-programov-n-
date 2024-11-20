package cz.spsmb.maturitaFormalita;

public class Main {
    public static void main(String[] args) {
        SimpleMonth leden = SimpleMonth.LEDEN;
        leden.getDays();
        for (int i = 0; i < SimpleMonth.values().length; i++) {
            System.out.println(SimpleMonth.values()[i] + " ma " + SimpleMonth.values()[i].getDays() + " dni");
        }
    }
}
