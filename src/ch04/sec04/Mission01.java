package ch04.sec04;

public class Mission01 {
    public static void main(String[] args) {
        //20부터 30까지 더한 값 출력
        // for문 사용

        int sum = 0;
        for (int i = 20; i <= 30; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
