package ch04.sec02;

public class Mission03 {
    public static void main(String[] args){

        // 1~100 사이의 랜덤값 나오게 해주시고

        // 랜덤값이 value = 5; 라면
        // 출력: 5는(은) 홀수입니다.

        // 랜덤값이 value = 97; 라면
        // 출력: 97는(은) 홀수입니다.

        // 랜덤값이 value = 54; 라면
        // 출력: 54는(은) 짝수입니다.

        /*int value = (int)(Math.random() * 100 ) + 1;

        if (value % 2 == 0){
            System.out.printf("%d는(은) 짝수입니다.", value);

        } else{
            System.out.printf("%d는(은) 홀수입니다.", value);
        }*/

        /*int value = (int)(Math.random() * 100 ) + 1;

        String oddEven = "홀";
        if (value % 2 == 0){
            oddEven = "짝";

        }
        System.out.printf("%d는(은) %s수입니다.", value, oddEven);
        }*/

        int value = (int)(Math.random() * 100 ) + 1;
        System.out.printf("%d는(은) %s수입니다.", value, value % 2 == 0? "짝": "홀"); //삼항식




    }}
