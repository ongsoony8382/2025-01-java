package ch04.sec02;

public class IfExample {

    public static void main(String[] args) {
        int score = 93;

        if ( score >= 90 ){
            System.out.println("점수가 90점보다 높습니다.");
            System.out.println("A등급입니다.");
        }


        if (score < 90) {
            System.out.println("점수가 90점보다 낮습니다.");
            System.out.println("B등급입니다.");
        }

    }
}
