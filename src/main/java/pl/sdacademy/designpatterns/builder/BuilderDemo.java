package pl.sdacademy.designpatterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        final Player player = new Player.Builder().withHealth(100).withHMana(20).withNick("Andrzej").build();
        final Player playerA = new Player.Builder().withHealth(90).withHMana(15).withNick("Michał").build();

        System.out.println(player);
        System.out.println(playerA);
    }
}
