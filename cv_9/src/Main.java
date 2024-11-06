public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman();
        woman.setName("Alice");
        woman.setAge(20);
        woman.setColorOfEyes("brown");
        Man man = new Man();
        man.setName("Bob");
        man.setAge(23);
        man.setColorOfEyes("blue");

        man.startMorningRoutine();
        woman.startMorningRoutine();
    }
}
