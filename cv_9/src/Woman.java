import java.util.*;

public class Woman extends Human{

    @Override
    public void startMorningRoutine() {
        System.out.println("Ráno vstanu a vyčistím si zuby.");

        Map<String, Human> map = new HashMap<>();
        map.put("adam", new Man());
        map.put("adam", new Woman());

        List<Human> mySet = new LinkedList<>();
        Man adam = new Man();
        Man jan = new Man();
        mySet.add(adam);
        mySet.add(jan);
        mySet.add(jan);

    }
}
