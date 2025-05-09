package ch04.sec02;

public class Mission01 {
    public static void main(String[] args){

        // 5 ~ 10 사이 랜덤값이 나올 수 있도록 해주세요.

        System.out.println(Math.random());

        for(int i = 0; i < 1000; i++){

            double value = 0.00001;


            int result = (int)(Math.random() * 6.0) + 5;




            if(result < 5 || result > 10){

                System.out.println("틀렸음!");
                break;
            }
        }

        System.out.println("--끝--");

    }
}
