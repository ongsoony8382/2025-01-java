package ch05.sec05.Method;

public class CharAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); //"남자" 리턴
        String gender2 = checkGender("900212-2998756"); //"여자" 리턴
        System.out.println(gender);
        System.out.println(gender2);
    }

    public static String checkGender(String str){
        char gen = str.charAt(7); /*charAt의 인덱스는 0번부터 시작.*/

        switch (gen){
            case '1','3':
                return "남자";
            case '2','4':
                return "여자";
            default:
                return "오류";

        }

    }
}
