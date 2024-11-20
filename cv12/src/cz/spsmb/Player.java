package cz.spsmb;

public class Player {
    //Vytvořte třídu Player. Tato třída bude obsahovat atributy name, age, spritePath, hp, mana a xp.
    String name;
    int age;
    String spritePath;
    int hp;
    int mana;
    int xp;

    public Player(String name, int age, String spritePath, int hp, int mana, int xp) {
        this.name = name;
        this.age = age;
        this.spritePath = spritePath;
        this.hp = hp;
        this.mana = mana;
        this.xp = xp;
    }

    public static PlayerBuilder returnPlayerBuilder(){
        return new PlayerBuilder();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", spritePath='" + spritePath + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", xp=" + xp +
                '}';
    }
}
