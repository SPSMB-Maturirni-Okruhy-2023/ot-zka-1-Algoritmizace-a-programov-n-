/**
 * Model class representing man instance
 * @extends Human
 * @author David Šec
 *
 */
public class Man extends Human{

    /**
     *
     * @param colorOfEyes - String representing colours of eyes
     */
    public Man(String colorOfEyes){
        super();
        setColorOfEyes(colorOfEyes);
    }

    public Man(){
        super();
    }

    /**
     *
     */
    @Override
    public void startMorningRoutine() {
        System.out.println("Ráno vstanu a vyčistím si zuby");
    }
}
