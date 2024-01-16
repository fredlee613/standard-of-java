package ch06;

public class Card {
    int number;
    String kind;

    static int height = 100;
    static int width = 50;

    public String toString() {
        return "number = " + number + ", kind = " + kind + ", height = " + height + ", width = " + width;
    }
}
