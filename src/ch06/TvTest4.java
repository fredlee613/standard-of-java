package ch06;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvs = new Tv[3];
        for (int i = 0; i < 3; i++) {
            Tv tv = new Tv();
            tv.channel = 10 + i;
            tvs[i] = tv;
        }

        for (Tv tv : tvs) {
            System.out.println("tv.channel = " + tv.channel);
        }

    }
}
