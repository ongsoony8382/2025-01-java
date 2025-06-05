package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {

        Korean Korean = new Korean("대한민국", "신사임당", "901022-2754312");


        System.out.println(Korean.nation); //대한민국
        System.out.println(Korean.name); //신사임당
        System.out.println(Korean.ssn); //901022-2754312

        Korean Korean2 = new Korean("홍길동", "901123-1543123");

        System.out.println(Korean2.nation); //대한민국
        System.out.println(Korean2.name); //홍길동
        System.out.println(Korean2.ssn); //901123-1543123

    }
}
