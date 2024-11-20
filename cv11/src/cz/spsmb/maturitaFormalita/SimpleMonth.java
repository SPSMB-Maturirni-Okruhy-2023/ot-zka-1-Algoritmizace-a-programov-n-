package cz.spsmb.maturitaFormalita;

public enum SimpleMonth implements Month{
    LEDEN(31),
    UNOR(29),
    BREZEN(31),
    DUBEN(30),
    KVETEN(31),
    CERVEN(30),
    CERVENEC(31),
    SRPEN(30),
    ZARI(31),
    RIJEN(30),
    LISTOPAD(31),
    PROSINEC(30);
    int numberOfDays;

    SimpleMonth(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


    @Override
    public int getDays() {
        return numberOfDays;
    }


}
