package ch03.sec01;

public class IncreaseDecreaseOperator_02 {
    public static void main(String[] args){
        int i1 = 5;
        // 읽기 > 쓰기
        i1++; //쓰기
        System.out.printf("i1: %d\n ", i1++); // 쓰기 읽기 둘 다 해야하는데 읽기부터 함. 6
        System.out.printf("i1: %d\n ", i1++); // 7
        System.out.printf("i1: %d\n ", i1); // 8

        System.out.println("---------");

        int i2 = 5;
        // 쓰기 > 읽기
        ++i2; //쓰기
        System.out.printf("i2: %d\n ", ++i2); // 쓰기 읽기 둘 다 해야하는데 쓰기부터 함.
        System.out.printf("i2: %d\n ", i2);

    }
}
