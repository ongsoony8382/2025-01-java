package ch04.sec02;

public class IfElseIfElseExample {

    public static void main(String[] args) {
        int score = 100;

        if ( score >= 90 ){
            System.out.println("점수가 90점보다 높습니다.");
            System.out.println("A등급입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80점~89점입니다.");
            System.out.println("B등급입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70점~79점입니다.");
            System.out.println("C등급입니다.");
        }

        else{
            System.out.println("점수가 70점 미만입니다.");
            System.out.println("D등급입니다.");
        }

        System.out.println("--끝--");

    }
}
