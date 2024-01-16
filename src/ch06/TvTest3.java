package ch06;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.channel = 7;

        t2 = t1; // t2는 t1의 인스턴스의 주소를 저장하게 되어 t1의 인스턴스를 바라보게 된다.

        System.out.println("t1.channel = " + t1.channel); // 7
        System.out.println("t2.channel = " + t2.channel); // 7
    }
}
