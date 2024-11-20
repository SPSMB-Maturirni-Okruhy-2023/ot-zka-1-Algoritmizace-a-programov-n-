package cz.spsmb;

public class PlayerBuilder {
    String name;
    int age;
    String spritePath;
    int hp;
    int mana;
    int xp;

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PlayerBuilder setSpritePath(String spritePath) {
        this.spritePath = spritePath;
        return this;
    }

    public PlayerBuilder setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public PlayerBuilder setMana(int mana) {
        this.mana = mana;
        return this;
    }

    public PlayerBuilder setXp(int xp) {
        this.xp = xp;
        return this;
    }
    public Player build() {
        return new Player(name, age, spritePath, hp, mana, xp);
    }
}
