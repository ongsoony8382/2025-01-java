package ch04.sec02;


    public class RandomNumber {

        public static void main(String[] args){
            //API, Math.random() double 타입 리턴 0.0000000~0.9999999 절대 1이 나오지 않음.
            // 랜덤 메소드의 최솟값은 언제나 0.
            // 10을 곱했을 때 나올 수 있는 최댓값은 9.

            System.out.println(Math.random());

            double value = 0.99999;
            double result = value * 10.0; //9.9999
            System.out.println("result: " + result);

            int intResult = (int)result; // 강제 형변환, 명시적 형변환, 9.9999 > 9
            System.out.println("intResult: " + intResult);

            double value2 = 0.00002;
            System.out.println("value2: " + (int)(value2 * 10.0));

            System.out.println((int)(Math.random() * 10.0));
            // 10을 곱했을 때 나올 수 있는 랜덤 숫자는 0부터 9까지 가능
            // 30을 곱했을 때 나올 수 있는 랜덤 숫자는 0부터 29까지 가능
            // 100을 곱했을 때 나올 수 있는 랜덤 숫자는 0부터 99까지 가능




        }

    }

