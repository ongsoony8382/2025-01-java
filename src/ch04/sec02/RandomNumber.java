package ch04.sec02;


    public class RandomNumber {

        public static void main(String[] args){
            //API, Math.random() double 타입 리턴 0.0000000~0.9999999 절대 1이 나오지 않음.

            System.out.println(Math.random());

            double value = 0.99999;
            double result = value * 10.0; //9.9999
            System.out.println("result: " + result);

            int intResult = (int)result; // 강제 형변환, 명시적 형변환, 9.9999 > 9
            System.out.println("intResult: " + intResult);



        }

    }

