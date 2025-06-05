package ch04.sec04;

public class Mission06 {
    //1부터 몇까지 더하면 누적 합계가 100을 넘지 않는 제일 큰 수가 뭔지 알아내는 예제

    // 1
    // 1 + 2  >> 3
    // 1 + 2 + 3  >> 6

    // 1 뷰터 12까지 합 78
    // 1부터 13까지 합 91
    // 1부터 14까지 합 105

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while(sum + i < 100){ // 다음 수를 더해도 100이 넘지 않는 동안
            sum += i; // 1 + 2 + ...

            i++ ;


        }
        System.out.println(i - 1 );



    }




}
