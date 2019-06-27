package pl.sdacademy.designpatterns.builder;


public class BuilderDemo {

    public static void main(String[] args) {

        final Player player = new Player.Builder().withHealth(100).withHMana(20).withNick("Andrzej").build();
        final Player playerA = new Player.Builder().withHealth(90).withHMana(15).withNick("Michał").build();

        System.out.println(player);
        System.out.println(playerA);

        final Book bookA = new Book.BookBuilder().withAuthor("Kowalski Jan").withTitle("Kozak").withPages(300).withISBN("3545454aaa").build();
        final Book bookB = new Book.BookBuilder().withAuthor("Sienkieiwcz").withTitle("Potop").withPages(450).withISBN("3546464Ddad").build();
        final Book bookC = new Book.BookBuilder().withAuthor("Mróz").withTitle("Chyłka").withPages(280).withDescription("Kryminał").build();

        System.out.println(bookA);
        System.out.println(bookB);
        System.out.println(bookC);

        Person personA = Person.builder().age(30).name("jan").surname("nowak").build();
        Person personB = Person.builder().age(22).name("kaz").surname("kowal").build();

        System.out.println(personA);


    }
}
