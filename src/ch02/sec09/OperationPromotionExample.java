package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        /*
          자동 타입 변환(promotion): (숫자형: 정수, 실수) 작은 타입이 큰 타입으로 대입될 때 발생

            byte < short, char < int < long < float < double

        */
        byte result1 = 10 + 20;
        System.out.println("result: " + result1);

        byte v1 = 10, v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 +v5; // >> 최종 결과 타입은? long
        // v3(byte) + v4(int)
        // v3(int) + v4(int) >> 110(int)
        // 110(int) + v5(long)
        // 110(long) + v5(long) >> 1110(long)
        // long result3 = 1110(long);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4: " + result4);
        System.out.println(("result4: " + (char)result4));

        int v8 = 10;
        int result5 = v8 / 4;
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6: " + result6); //2.5

        int v10 = 1;
        int v11 = 2;
        double result7 = (double)v10 / v11;
        System.out.println("result7: " + result7);


    }
}
