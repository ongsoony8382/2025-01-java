package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*

       주민 번호를 입력하시오. (xxxxxx-xxxxxxx)>

       (만약) 주민등록번호 길이가 다르면 "잘못 입력하셨습니다."
       (길이가 맞다면) 8번째 자리의 값으로 "여성", "남성" 출력해주세요.
       (8번째 자리가 1~4가 아니라면) "잘못 입력하셨습니다."
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호를 입력하시오.");
        String ssn = scanner.next();

        if(ssn.length() != 14){
            System.out.println("잘못 입력하셨습니다.");
        }
        else{
            char gender = ssn.charAt(7);

            if (gender > 49 & gender < 53 ){
                switch (gender){
                    case '1','3':
                        System.out.println("남성");
                        break;
                    case '2', '4':
                        System.out.println("여성");
                        break;
                }
            }else{
                System.out.println("잘못 입력");
            }


        }
    }
}
