package ch06;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        c1.kind = "heard";
        c1.number = 1;

        c2.kind = "spade";
        c2.number = 10;

        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());

        Card.height = Card.height / 2;
        Card.width = Card.width / 2;

        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());
    }
}
