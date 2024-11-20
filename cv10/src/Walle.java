public class Walle implements Robot{
    @Override
    public void move() {
        System.out.println("Walle is moving");
    }

    @Override
    public void work(int a) {
        System.out.println("Walle is working" + a);
    }

    @Override
    public void turnOn() {
        System.out.println("Walle is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Walle is off");
    }
}
