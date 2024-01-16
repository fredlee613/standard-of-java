package ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv;
        tv = new Tv();
        tv.channel = 7;
        tv.power = false;
        tv.channelUp();
        tv.power();

        if (tv.power) System.out.println("currentChannel = " + tv.channel);
    }
}
