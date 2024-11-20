import java.util.ArrayList;
import java.util.List;

public class Eve implements Robot{
    @Override
    public void move() {
        System.out.println("Eve is moving");
    }

    @Override
    public void work(int a) {
        List<Integer> zbytek = new ArrayList<>();
        int cislo = a;
        while(cislo > 0){
            zbytek.add(cislo % 2);
            cislo = cislo/2;
        }
        System.out.println("Eve is working" + a);
        System.out.println(reverse(zbytek));
    }

    /**
     * return reversed list from param
     * @param zbytek (List<Integer>) list to reverse
     * @return (List<Integer>) reversed list
     */
    public List<Integer> reverse(List<Integer> zbytek){
        List<Integer> result = new ArrayList<>();
        for (int i = zbytek.size()-1; i >= 0; i--) {
                result.add(zbytek.get(i));
        }
        return result;
    }

    @Override
    public void turnOn() {
        System.out.println("Eve is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Eve is off");
    }
}
