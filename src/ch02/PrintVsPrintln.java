package ch02;

public class PrintVsPrintln {

    public static void main(String[] args){

        //print : 안녕안녕이 옆으로 출력
        System.out.print("안녕");
        System.out.print("안녕\n");

        System.out.println("------------------");

        //println : 개행을 함.
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        //print + 개행 (이스케이프 문자 \n)
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        System.out.print("안녕\n");

        System.out.print("안녕\\n");
        System.out.print(" \"안녕\" \\n\n");
        System.out.print("안녕하세요\n반갑습니다.\n");

        //printf
        int age = 22;
        String name = "홍길동";
        float height = 172.5f;
        // age, name, height 변수를 활용하여 아래처럼 출력시켜주세요.
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm입니다.
        System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살이며 키는 " + height + "cm입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다.\n", name, age, height);

        // 크게 자바 타입은... : (원시타입) 정수 / 실수 / 불린 / 문자
        // 그리고 레퍼런스 <- 대문자로 시작 (String)








    }

}
