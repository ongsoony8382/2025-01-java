package ch04.sec02;


import java.util.Scanner;

public class Mission04 {
    public static void main(String[] args) {
        //int score = ??; // 0~ 200 사이 랜덤값

        //만약 score 값이 100~90 사이면 A
        //만약 score 값이 80~89 사이면 B
        //만약 score 값이 70~79 C
        //만약 score 값이 70점 미만이면 D
        //만약 score 값이 100을 넘거나 0점 아래면 "측정불가"\


        /*int score = (int)(Math.random() * 201);
        System.out.println(score);

       if (score >=90 && score <= 100){
           System.out.println("A");
       } else if (score >=80 && score <= 89){
           System.out.println("B");
       } else if (score >=70 && score <= 79){
           System.out.println("C");
       } else if (score < 70) {
           System.out.println("D");
       } else
           System.out.println("측정불가");

        System.out.println("--끝--");
    }*/


    Scanner scan = new Scanner(System.in);
    System.out.print("점수를 입력해주세요.");
    int score = scan.nextInt();
    System.out.printf("score: %d\n", score);



        if (score < 0 || score > 100) { // 0미만 이거나 100 초과인 경우
            System.out.println("측정불가");

        } // 0~100 사이

        else if (score >= 90) { // 100~90 사이
          System.out.println("A학점");
        }

        // 0~89

        else if (score >= 80) { // 80~89 사이
            System.out.println("B학점");
        }

        // 0~79

        else if (score >= 70) { // 70~79 사이
            System.out.println("C학점");
        }

        // 0~69
        else { // 0~69
            System.out.println("D학점");
        }

        System.out.println("--끝--");

    }
}
