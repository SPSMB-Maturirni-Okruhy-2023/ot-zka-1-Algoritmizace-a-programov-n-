package cz.spsmb;

public class Main {
    public static void main(String[] args) {
        Player player = Player.returnPlayerBuilder().setName("Steve").setMana(200).build();
        System.out.println(player);
    }
}
