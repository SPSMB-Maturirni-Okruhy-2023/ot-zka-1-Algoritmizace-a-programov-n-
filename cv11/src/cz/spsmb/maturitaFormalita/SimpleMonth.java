package cz.spsmb.maturitaFormalita;

public enum SimpleMonth implements Month{
    LEDEN(31){
        @Override
        public void getDescription() {
            System.out.println("V lednu je docela zima.");
        }
    },
    UNOR(29){
        @Override
        public void getDescription() {
            System.out.println("V únoru je stále zima.");
        }
    },
    BREZEN(31),
    DUBEN(30),
    KVETEN(31),
    CERVEN(30),
    CERVENEC(31),
    SRPEN(30),
    ZARI(31) {
        @Override
        public void getDescription() {
            System.out.println("V září je čas jít zpět do školy.");;
        }
    },
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

    @Override
    public void getDescription() {
        System.out.println("Default message.");
    }


}
